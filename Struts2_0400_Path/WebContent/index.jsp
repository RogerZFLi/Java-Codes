<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" import = "java.util.*" pageEncoding="UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s"
%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//在head中<base href>指定basePath
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath %>" />
<title>HelloStruts2</title>
<meta http-equiv="Content-Type" content ="text/html;charset=UTF-8">


</head>
<body>
<a href="<%=basePath %>path.action">路径问题说明</a>
</body>
</html>