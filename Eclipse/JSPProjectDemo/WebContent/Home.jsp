<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>

</head>
	
<body>

	<%!

public String capitalize(String name){
	if (name != null)
		return  name.substring(0,1).toUpperCase()+ name.substring(1,name.length());
	return "";
}


public void storeDetails() {
	System.out.println("Hellooooo");
}
%>
	<h1>Welcome 
	 <% 
	 	String name = request.getParameter("txtName");
	 	request.setAttribute("name",name ); 
	 	out.println(capitalize(name));
	 %>
	 , </h1>
	 
	 <form action = 'Menu.jsp'>
	 	Select Your Gender <br />
	 	<input type = 'radio' name = 'gender' value = 'Male' >MALE<br>
	 	<input type = 'radio' name = 'gender' value = 'Female'>FEMALE <br>
	 	<input type = 'radio' name = 'gender' value = 'TransGender' >TRANSGENDER
	 	<br /><br />
	 	Select you DOB
	 	<!-- <input type="date" name = "DOB"> -->
	 	<input type = 'submit' name = 'btnSubmit' value = 'Submit'>
	 </form>
</body>
</html>