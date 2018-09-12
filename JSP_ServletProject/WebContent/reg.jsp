<%@ page language="java" import= "servlet.practice.domain.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String msg = (String)request.getAttribute("msg");
	
	if (msg!=null && msg.length()>0){
%>	
	<h3><font color = "red"><%=msg %></font></h3>
<%	}%>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String usergender = request.getParameter("usergender");
	String userage = request.getParameter("userage");
	
%>
<form action = "RegUserServlet.do" method = "POST">
	<table border="1">
		<tr>
		<td>用户名</td>
		<td><input type="text" name = "username" id = "username" value ="<%=username %>"></td>
		</tr>
		<tr>
		<td>密码</td>
		<td><input type="password" name ="password" id = "password" value="<%=password %>"></td>
		</tr>
		<tr>
		<td>性别</td>
		<td>男<input type="radio" name="usergender" value="1" checked="checked"></td>
		<td>女<input type="radio" name="usergender" value="0" checked="checked"></td>
		</tr>
		<tr>
		<td>年龄</td>
		<td><input type="text" name = "userage" id = "userage" value ="<%=userage %>"></td>
		</tr>
		
	</table>
	<input type="submit" value = "OK"/><input type ="reset" value = "RESET"/>
</form>
</body>
</html>