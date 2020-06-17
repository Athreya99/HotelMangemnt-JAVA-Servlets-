
package del;



import static del.Provider.*;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.annotation.WebServlet;
import javax.swing.JOptionPane;
@WebServlet("/ConnectionProvider2")
public class ConnectionProvider
{
     
    private static Connection con = null;
    private ConnectionProvider()
    {
        
    }
    static 
    {
        
        try
        {
         
           /* Class.forName(driver);
            con=DriverManager.getConnection(url, username, password);*/
            Class.forName(driver);
            con=DriverManager.getConnection(url, username, password);

        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
    }

    public static Connection getConnection() 
    {
        return con;
    }

    
}
