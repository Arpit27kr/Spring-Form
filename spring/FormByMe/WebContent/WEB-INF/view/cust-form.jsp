<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
<STYLE>
.error{color:red}

</STYLE>
</head>
<body>

<h3><center>Customer Registration Form </center></h3>
 <form action="processform" method="Get" modelAttribute="customer">
     
    First Name:  <Input type="String" name="param1" placeholder="enter your first  Name "/>
     <br><br>
 
     
    Last Name(*):  <Input type="String" name="param2" placeholder="enter your last Name "/> 
       <form:errors path="param2" cssclass="error"/>
     <br> <br>
     
     <input type="submit" value="Submit">
     


</body>
</html>