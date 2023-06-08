use AdventureWorksDW2022;

-- Cau 1:
select 
	concat(FirstName, MiddleName, LastName) as FullName, 
	BirthDate, 
	(case when Gender ='F' then 'Female' else 'Male' end) Gender, 
	EmailAddress, EnglishEducation as Education, Phone, AddressLine1, AddressLine2 
from 
	DimCustomer c
JOIN 
	DimGeography g
on
c.GeographyKey= g.GeographyKey
where
	g.CountryRegionCode = 'GB'
;




-- Cau 2:
-- Total number of customers by country includes 2 columns: CountryName, TotalCustomer

select 
	EnglishCountryRegionName as CountryName,count(*) as TotalCustomer
from 
	DimCustomer c
JOIN 
	DimGeography g
on
	c.GeographyKey= g.GeographyKey
group by EnglishCountryRegionName
order by EnglishCountryRegionName;

-- ProductInformation table generation 
drop table ProductInformation;

select
	ProductKey,EnglishProductName as ProductName , 
	ModelName, ProductLine ,EnglishProductCategoryName as ProductCategoryName,EnglishProductSubcategoryName as ProductSubCategoryName,
	DealerPrice,ListPrice,Color,EnglishDescription as Decription	
into ProductInformation
from 
	DimProduct a
join
	DimProductSubcategory b
on 
	a.ProductSubcategoryKey = b.ProductSubcategoryKey
join 
	DimProductCategory c
	on
b.ProductCategoryKey = c.ProductCategoryKey;
select * from ProductInformation;




--Cau 3: Get the top 100 products of the highest selling price (ListPrice) including the following columns:
-- ProductName (English), ModelName, ProductLine, ProductCategoryName (English), 
-- ProductSubcategoryName (English), DealerPrice, ListPrice, Color, Description (English)

select
	top 100 EnglishProductName as ProductName , 
	ModelName, ProductLine ,EnglishProductCategoryName as ProductCategoryName,EnglishProductSubcategoryName as ProductSubCategoryName,
	DealerPrice,ListPrice,Color,EnglishDescription as Decription
from 
	DimProduct a
join
	DimProductSubcategory b
on 
	a.ProductSubcategoryKey = b.ProductSubcategoryKey
join 
	DimProductCategory c
	on
b.ProductCategoryKey = c.ProductCategoryKey
order by ListPrice;


-- Cau 4: Finance Exercise

select *
 from 
	(
	select AccountDescription,Amount,OrganizationName
	from 
	FactFinance
join	
	DimAccount
	on FactFinance.AccountKey = DimAccount.AccountKey 
join DimOrganization
	on DimOrganization.OrganizationKey = FactFinance.OrganizationKey
	)
	as sourcetable
pivot
	(
	sum(Amount)
	for OrganizationName in ([France], [Germany], [Australia])
	) as pivottable
	;


-- Cau 5


select
	 m.*, UnitsBalance, UnitCost
from 
	ProductInformation m
join
	(
	select a.ProductKey,a.MovementDate,a.UnitsBalance,a.UnitCost
	from 
		FactProductInventory a
	join
	(
		select ProductKey,Max(MovementDate) as MaxDate
		from
			FactProductInventory
		group by ProductKey
	) latest
	on 
		a.ProductKey = latest.ProductKey and a.MovementDate = latest.MaxDate
	) latestinfo
on
	m.ProductKey = latestinfo.ProductKey;
	
	select * from ProductInformation;


-- Câu 6:

select
	m.*, UnitsBalance, UnitCost
from 
	ProductInformation m
join
	(
	select distinct top 10 a.ProductKey,a.UnitsBalance,a.UnitCost
	from 
		FactProductInventory a
	join
	(
		select ProductKey,Max(UnitCost) as MaxCost
		from
			FactProductInventory
		group by ProductKey
	) maxcost
	on 
		a.ProductKey = maxcost.ProductKey and a.UnitCost = maxcost.MaxCost
		order by a.UnitCost desc
	) maxcostinfo
on
	m.ProductKey = maxcostinfo.ProductKey
order by UnitCost desc;

-- Cau 8: Get the Internet Sales invoice details of the product whose English Name is "Road-150 Red, 48" including the following columns:
-- SalesOrderNumber, SalesOrderLineNumber, CustomerName, 
-- ProductName, OrderQuantity, UnitPrice, DiscountAmount,
-- SalesAmount, ProductStandardCost, TotalProductCost

select SalesOrderNumber,SalesOrderNumber, SalesOrderLineNumber, concat([FirstName],[MiddleName],[LastName]) as CustomerName, EnglishProductName as ProductName, OrderQuantity, UnitPrice, DiscountAmount,
SalesAmount, ProductStandardCost, TotalProductCost
from 
	FactInternetSales
 join 
	DimCustomer
 on
	FactInternetSales.CustomerKey = DimCustomer.CustomerKey
join 
	DimProduct
on
    DimProduct.ProductKey = FactInternetSales.ProductKey
where 
	DimProduct.EnglishProductName='Road-150 Red, 48';


-- Cau 9
-- Get information 20 Internet Sales invoices with the highest total payable including 
-- the following columns: CustomerName, SalesOrderNumber, CustomerKey, TotalOrderCost


select distinct concat([FirstName],[MiddleName],[LastName]) as CustomerName, SalesOrderNumber , table1.CustomerKey, TotalOrderCost
from 
	(
	select distinct CustomerKey, FactInternetSales.SalesOrderNumber, TotalOrderCost
	from 
	( select top 20
		SalesOrderNumber, sum(TotalProductCost) as TotalOrderCost
		from 
		FactInternetSales
		group by SalesOrderNumber
		) table0
		join 
		FactInternetSales
		on table0.SalesOrderNumber = FactInternetSales.SalesOrderNumber 
	) table1
 join 
	DimCustomer
 on
	table1.CustomerKey = DimCustomer.CustomerKey
order by TotalOrderCost desc;


-- Câu 10:


select 
		table0.ResellerKey, TotalQuantity,TotalOrderCost into ResellerInfomation
	 from
	(
			( select 
				ResellerKey, sum(OrderQuantity) as TotalQuantity
			from 
				FactResellerSales
			group by 
				ResellerKey
			)  table0
		join 
			( 
			select 
				ResellerKey, sum([TotalProductCost]) as TotalOrderCost
			from 
				FactResellerSales
			group by ResellerKey
			) table1
			on table0.ResellerKey = table1.ResellerKey 
	 ) ;
	 drop table ResellerInfomation;

	 select * from ResellerInfomation;


select top 10 ResellerName, a.ResellerKey , TotalQuantity, TotalOrderCost
from 
	 ResellerInfomation a
	join 
	DimReseller b
 on
	a.ResellerKey = b.ResellerKey
	order by TotalOrderCost desc;




	

	
	