
package hr;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBloader {
    
    public static ResultSet executeSQL(String sql)
    {
         try
         {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading done");
            
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");
            System.out.println("Connection done");
            
            Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            System.out.println("statement done");
            
            ResultSet rs=stmt.executeQuery(sql);
            System.out.println("result set created");
            
            return rs;
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
        return null;
    }
         
    }

    static void executeUpdate(String s1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
