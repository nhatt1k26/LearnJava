package JMySQL.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExp {
    public static void main(String[] args) throws SQLException {
        String sqlUrl="jdbc:mysql://localhost:3306/dbbasics";
        String userName = "root";
        String password = "admin";
        try(
                Connection con = DriverManager.getConnection(sqlUrl,userName,password);
                Statement st = con.createStatement();
                )
        {
            String sqlInsert = "INSERT INTO country VALUES('NhatBan',8);";
            int numberRowsAffect = st.executeUpdate(sqlInsert);
            System.out.println("Number of rows affect: "+ numberRowsAffect);
        }
    }
}
