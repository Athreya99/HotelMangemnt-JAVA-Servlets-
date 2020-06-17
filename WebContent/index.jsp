
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel Management</title>
    </head>
    <body>
    <center><h2>HOTEL BOOKING SYSTEM</h2></center>
       <form action="ControllerReg2" method="post">
       <center><h3> New Customer</h3></center>
       <br><br>
       
          <center>
          Room Number:<input type="text" name="roomno"><br><br></center>
           <center><br>Name:<input type="text" name="uname"><br/>
          <br>
           <br>Password:<input type="password" name="upass"><br/>
           <br>
           <select name="type">
  <option value="AC">AC</option>
  <option value="NON-AC">Non-AC</option>
  </select>   
  <br>
  <br>
  <br>
  
 
           <input type="submit" value="Go">
           <input type="reset" value="Reset"><center>
           <br>
       </form><center>
        <a href="login.jsp">Login</a>  | 
        <a href="CustomerLogin.jsp">Customer Login</a>  | 
         <a href="delete.jsp">Delete</a>
    </body>
</html>
