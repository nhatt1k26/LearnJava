package JMySQL.JDBC;
import java.sql.*;
public class PrepareStatementExp {
    public static void main(String[] args) throws SQLException {
        String sqlUrl="jdbc:mysql://localhost:3306/dbbasics";
        String userName = "root";
        String password = "admin";
        try(
                Connection con = DriverManager.getConnection(sqlUrl,userName,password);
        )
        {
            String sqlInsert = "INSERT INTO orderdetails VALUES(?,?,?,?,?);";
            PreparedStatement  prepareStatement = con.prepareStatement(sqlInsert);
            prepareStatement.setInt(1,1233);
            prepareStatement.setInt(2,1223);
            prepareStatement.setInt(3,12);
            prepareStatement.setFloat(4,(float)2.3);
            prepareStatement.setInt(5,71827672);
            boolean result = prepareStatement.execute();
            System.out.println("Number of rows affect: "+ result);
        }
    }
}
