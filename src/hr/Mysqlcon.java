
package hr;
 import java.sql.*; 

public class Mysqlcon {
     
public static void main(String args[]){  
try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","system");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from forgotpass");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2));  
con.close();  
}
catch(Exception e)
                { 
                    System.out.println(e);
                }  
}  
}  
    


