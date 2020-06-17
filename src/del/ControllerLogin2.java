
package del;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ControllerLogin2")
public class ControllerLogin2 extends HttpServlet
{
     protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
     {
        

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
       
        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass");
        String roomtype=req.getParameter("roomtype");
        String roomno=req.getParameter("roomno");
        UserBean ub = new UserBean();
        ub.setUname(uname);
        ub.setUpass(upass);
        ub.setRoomtype(roomtype);
       ub.setRoomNo(roomno);
        req.setAttribute("ub", ub);
        boolean status=LoginDao.validate(ub);
        if(status)
        {
            RequestDispatcher rd = req.getRequestDispatcher("Db.jsp");
            rd.forward(req, res);
        }
        else{
            RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
            rd.include(req, res);
            
        }
        

    }
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse res)  
            throws ServletException, IOException {  
        doPost(req, res);  
    }  
    

}
