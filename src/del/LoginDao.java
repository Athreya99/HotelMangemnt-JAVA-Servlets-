
package del;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
@WebServlet("/LoginDao")
public class LoginDao 
{
    public static boolean validate(UserBean b)
    {
        boolean status=false;
        ResultSet rs;
        try{
            
           Connection con=ConnectionProvider.getConnection();
           String insertquery="select * from admin where uname=? and upass=?";
           PreparedStatement ps=con.prepareStatement(insertquery);
           ps.setString(1, b.getUname());
           ps.setString(2, b.getUpass());
           rs=ps.executeQuery();
           status=rs.next();
          
        }
        catch(Exception e)
        {
            System.out.println("Error is:\n"+e.getMessage());
           
            
        }
        
        return status;
        
    }
    
}
