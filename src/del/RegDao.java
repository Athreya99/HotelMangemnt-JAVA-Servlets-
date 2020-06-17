
package del;

import java.sql.*;

import javax.servlet.annotation.WebServlet;

@WebServlet("/RegDao")
public class RegDao
{
     
    public static int register(UserBean ub)
    {
       int i=0;
       try{
           Connection con=ConnectionProvider.getConnection();
           String insertquery="insert into reg values(?,?,?,?)";
           PreparedStatement ps=con.prepareStatement(insertquery);
           ps.setString(1, ub.getRoomNo());
           ps.setString(2, ub.getUname());
           ps.setString(3, ub.getUpass());
           ps.setString(4,ub.getRoomtype());
           i=ps.executeUpdate();
           System.out.println(i);
   
       }
       catch(Exception e)
       {
           System.out.println(e.toString());
         
       }
     
      return i;  
    }
    
}
