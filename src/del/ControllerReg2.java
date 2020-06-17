
package del;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ControllerReg2")
public class ControllerReg2 extends HttpServlet 
{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String roomno=req.getParameter("roomno");
        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass");
        String roomtype=req.getParameter("type");
        

        UserBean ub = new UserBean();
        ub.setRoomNo(roomno);
        ub.setUname(uname);
        ub.setUpass(upass);
        ub.setRoomtype(roomtype);
       
       
        req.setAttribute("ub", ub);
       
        int i=RegDao.register(ub);
        if(i>0)
        {
            RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
            rd.forward(req, res);
        }
        else{
        	
            RequestDispatcher rd = req.getRequestDispatcher("error-insert.jsp");
            rd.include(req, res);
            
        }
        

    }
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse res)  
            throws ServletException, IOException {  
        doPost(req, res);  
    }  

}
