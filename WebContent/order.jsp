<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<center><h4>ORDER</h4></center>
<br><br><br>

Enter Room Number:<input type="text" name="roomno">
  
<h3>Starters</h3>
<form action="" method="post">
  <input type="checkbox" name="starters" value="ChineseBhel" /> Chinese Bhel<br>
  <input type="checkbox" name="starters" value="Gobi" /> Gobi<br>
  <input type="checkbox" name="starters" value="Babycorn" /> Babycorn<br>
</form>

<br><br><br>
<h3>Rice</h3>
<center></center><form action="" method="post">
  <input type="checkbox" name="rice" value="Pulav" /> Pulav<br>
  <input type="checkbox" name="rice" value="WhiteRice" /> White Rice<br>
  <input type="checkbox" name="rice" value="Jeerarice" /> Jeera Rice<br>
</form>

<br><br><br>
<h3>Dessert</h3>
<form action="" method="post">
  <input type="checkbox" name="dessert" value="Cake" /> Cake<br>
  <input type="checkbox" name="dessert" value="IceCream" /> Ice Cream<br>
  <input type="checkbox" name="dessert" value="Juice" /> Juice<br>
</form>
<form action="OrderPlaced.jsp">
<center><input action="OrderPlace.jsp" type="submit"></center>
<br><br>
</form>
 <center><a href="index.jsp">Return to Main Page</a></center>


</body>
</html>