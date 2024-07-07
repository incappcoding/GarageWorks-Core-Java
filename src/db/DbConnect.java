package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement st;
    public DbConnect(){
        try{
            //jdbc code
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/garageworksdb?useSSL=false&allowPublicKeyRetrieval=True",
                "root","incapp@123");
            st=c.createStatement();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
