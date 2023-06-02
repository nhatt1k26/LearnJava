package ZExercises.Exs13;

import ZExercises.Exs13.entity.Employee;
import ZExercises.Exs13.entity.Experience;
import ZExercises.Exs13.entity.Fresher;
import ZExercises.Exs13.entity.Intern;
import ZExercises.Exs13.exception.*;
import ZExercises.Exs13.utility.EmployeeUtility;

import javax.net.ssl.SNIHostName;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Company {
    List<Employee> employees = new ArrayList<>();
    List<Intern> interns = new ArrayList<>();
    List<Experience> experiences = new ArrayList<>();
    List<Fresher> freshers = new ArrayList<>();

    public Company() {
    }

    public void addEmployee(Scanner sc) {
       // Scanner sc = new Scanner(System.in);
        try  {
            System.out.println("Moi nhap thong tin nhan vien");
            //get and check empty
            System.out.println("Loai nhan vien (Intern,Fresher,Experience):");
            String employeeType = sc.nextLine();
            if (!EmployeeUtility.isValidEmployeeType(employeeType))
                throw new EmployeeTypeException("Kieu nhan vien khong hop le");

            System.out.println("Thong tin so hieu nhan vien: ");
            String id = sc.nextLine();
            // Get and check valid fullname
            System.out.println("Thong tin ho ten: ");
            String fullName = sc.nextLine();
            if (!EmployeeUtility.isValidName(fullName))
                throw new FullNameException("Khong duoc chua ky tu dac biet");

            //Get and check valid birthday
            System.out.println("Thong tin ngay sinh");
            LocalDate birthday = LocalDate.parse(sc.nextLine());
            if (!EmployeeUtility.isValidDateOfBirth(birthday))
                throw new BirthdayException("Ngay sinh khong hop le");

            //Get and check valid phone number
            System.out.println("Thong tin so dien thoai: ");
            String phoneNumber = sc.nextLine();
            if (!EmployeeUtility.isValidPhoneNumber(phoneNumber))
                throw new PhoneException("Khong hop le");

            //get and check email
            System.out.println("Thong tin email: ");
            String email = sc.nextLine();
            if (!EmployeeUtility.isValidEmail(email))
                throw new EmailException("Khong chua ky tu dac biet");
            System.out.println("Dang tao nhan vien moi...");
            Employee newEmployee = new Employee(id, fullName, birthday, phoneNumber, email, employeeType);
            addEmployee(newEmployee);
            System.out.println("Tao nhan vien thanh cong");
        } catch (FullNameException e) {
            System.out.println("Ten Khong hop le"+e);
        } catch (BirthdayException e) {
            System.out.println("Ngay sinh khong hop le"+e);
        } catch (EmailException e) {
            System.out.println("Email khong dung dinh dang"+e);
        } catch (PhoneException e) {
            System.out.println("So dien thoai khong hop le:"+e);
        } catch (EmployeeTypeException e) {
            System.out.println("Kieu nhan vien Khong hop le:"+e);
        }
        catch (Exception e){
            System.out.println("Loi dau vao:"+e);
        }
      //  sc.close();
    }

    public void addEmployee(Employee newemployee) {
        employees.add(newemployee);
        // instanceof and downcasting
        if (newemployee instanceof Intern)
            interns.add((Intern) newemployee);
        if (newemployee instanceof Experience)
            experiences.add((Experience) newemployee);
        if (newemployee instanceof Fresher)
            freshers.add((Fresher) newemployee);
    }

    public void updateEmployee(Scanner sc) {
        try{
            System.out.println("Chinh sua thong tin nhan vien ");
            System.out.println("Thong tin so hieu nhan vien: ");
            String updateId = sc.nextLine();
            System.out.println("Thong tin ho ten chinh sua: ");
            String updateName = sc.nextLine();
            // Check valid Name
            if (!EmployeeUtility.isValidName(updateName))
                throw new FullNameException("Ten khong hop le");
            // Update information
            (employees).stream().forEach(s -> {
                if (s.getId().equals(updateId))
                    s.setFullName(updateName);
            });
            // View result
            System.out.println("Da cap nhat thong tin nhan vien");
        }
        catch(FullNameException e)
        {
            System.out.println(e);
        }
    }



    public void showEmployeeList(List<Employee> myList) {
        Stream.of(myList).forEach(System.out::println);
    }


    public void deleteEmployee(Scanner sc){
        System.out.println("Nhap ID cua nhan vien can xoa: ");
        String deleteId = sc.nextLine();
        Employee resultEmployee= employees.stream().filter(s -> s.getId() == deleteId).findFirst().orElse(null);
        resultEmployee.showInfo();
        System.out.println("Xac nhan xoa thong tin nhan vien?");
        deleteEmployee(deleteId);

    }
    public void deleteEmployee(String deleteId) {
        employees = employees.stream().filter(s -> (s.getId().equals(deleteId))).collect(Collectors.toList());
    }

    //Overload
    public void showEmployeeList() {
        showEmployeeList(employees);
    }

    public void showExperience() {
        Stream.of(experiences).forEach(System.out::println);
    }

    public void showIntern() {
        Stream.of(interns).forEach(System.out::println);
    }

    public void showFresher() {
        Stream.of(freshers).forEach(System.out::println);
    }

}
