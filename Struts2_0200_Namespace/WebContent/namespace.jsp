
<%@ page language="java" import = "java.util.*" pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName();
%>
<!DOCTYPE html>
<html>
<head>
<base href ="<%=basePath %>">
<title>HelloStruts2</title>
<meta http-equiv="pragma" content ="nocache">
<meta http-equiv="cache-control" content ="nocache">
<meta http-equiv="expires" content ="0">

</head>
<body>
hello, byebye<br/>
</body>
</html>