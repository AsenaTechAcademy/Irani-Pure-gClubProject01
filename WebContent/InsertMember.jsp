<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../CommonIncludes/Header.jsp" %>

<% 
String s= (String) request.getParameter("Ido");
//out.print("Ido is: " + s);


if (s!= null && s.equals("1"))
{
	out.print("<br> <p align=center>");
	out.print("اطلاعات به درستی در پایگاه داده ثبت شد");
	out.print("</p><br>");
}
%>

<form action="InsertMemberController" method="post">
	Member Number: <input type="text" name="txtmno"> <br>
	Name: <input type="text" name="txtname"> <br>
	Family: <input type="text" name="txtfamily"> <br>
	Address: <input type="text" name="txtaddress"> <br>
	Phone: <input type="text" name="txtphone"> <br>
	Age: <input type="text" name="txtage"> <br>
	<input type="submit" value="ثبت عضو جدید">
	
</form>




<br><br><br><br><br><br><br><br>
<%@ include file="../CommonIncludes/Footer.jsp" %>
</body>
</html>