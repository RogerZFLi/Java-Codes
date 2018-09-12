<%@ page language="java" import = "servlet.practice.domain.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		User u = (User)request.getAttribute("user");
	
	%>
	<form action ="UpdateUser.do" method="post">
		<table border="1">
			<tr>
			<td>用户名</td>
			<td><input type="text" name = "username" id = "username" value ="<%=u.getUsername() %>"readonly="readonly"></td>
			</tr>
			<tr>
			<td>密码</td>
			<td><input type="password" name ="password" id = "password" value="<%=u.getPassword() %>"></td>
			</tr>
			<tr>
			<td>性别</td>
			<td>
			<%if ("1".equals(u.getUsergender())){
			%>
				男<input type="radio" name="usergender" value="1" checked="checked">	
				女<input type="radio" name="usergender" value="0" >
			<%}else{ %>
				男<input type="radio" name="usergender" value="1" >
				女<input type="radio" name="usergender" value="0" checked="checked">
			<%} %></tr>
			<tr>
			<td>年龄</td>
			<td><input type="text" name = "userage" id = "userage" value ="<%=u.getUserage() %>"></td>
			</tr>
		
		</table>
		<input type="submit" value = "OK"/><input type ="reset" value = "RESET"/>
	</form>
</body>
</html>