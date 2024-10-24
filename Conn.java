
package travel.management.system;
import java.sql.*;


public class Conn {
    
    
    Connection c;
    Statement s; // 3 step is CREATING AND DEFIN THE STATEMENT
    
    Conn(){    // 1 step of database connectivity in java is to REGISTER THE DRIVER CLAS
        try{
            Class.forName("com.mysql.cj.jdbc.driver"); // here we given the path jdbc connector 
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem","root","123456");
            s = c.createStatement(); // DEFINE THE STATEMENT USING CREATESTATEMENT FUN()
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}
