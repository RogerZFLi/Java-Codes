<%@ page language="java" import = "java.util.List" import = "servlet.practice.domain.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<User> list = (List)request.getAttribute("list");
%>
	<table align="center" width="80%">
		<tr>
			<td>序号</td>
			<td>姓名</td>
			<td>密码</td>
			<td>性别</td>
			<td>年龄</td>
			<td>操作</td>
		</tr>
		<%
			for (int i=0;i<list.size();i++) {
				User u = list.get(i);
		%>
		<tr>
			<td><%=i+1 %></td>
			<td><%=u.getUsername() %></td>
			<td><%=u.getPassword() %></td>
			<td>
			<%
				if ("1".equals(u.getUsergender())) {
			%>
				男		
			<%} else {%>
				女
			<%} %>
			</td>
			<td><%=u.getUserage() %></td>
			<td>
			<a href ="PreUpdateUser.do?username=<%=u.getUsername() %>">Update</a>
			<a href ="DeleteUser.do?username=<%=u.getUsername() %>">Delete</a>
			</td>
		</tr>
		
		<%}%>
	</table>
</body>
</html>