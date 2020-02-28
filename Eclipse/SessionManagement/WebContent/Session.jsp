<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Session Manager</title>
</head>
<body>
<%	
	HttpSession Csession = request.getSession();
	Csession.setMaxInactiveInterval(15);
	Csession.setAttribute("usernamekey", "Raghul");
	Csession.setAttribute("languagekey", "Tamil");
	out.println("usernamekey"+Csession.getAttribute("usernamekey")+"   languagekey"+Csession.getAttribute("languagekey"));
%>
</body>
</html>