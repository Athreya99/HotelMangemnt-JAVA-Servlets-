package del;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
@WebServlet("/DeleteDao")
public class DeleteDao {

    public int delete(UserBean u) 
    {
        int i = 0;
        try {
            Connection con = ConnectionProvider.getConnection();

            PreparedStatement ps = con.prepareStatement("Delete from reg where uname=?");

            ps.setString(1, u.getUname());

            i = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error is:" + e);
        }
        return i;

    }

}
