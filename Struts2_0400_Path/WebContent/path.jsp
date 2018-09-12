<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" import = "java.util.*" pageEncoding="UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s"
%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath %>" />
<title>HelloStruts2</title>
<meta http-equiv="Content-Type" content ="text/html;charset=UTF-8">


</head>
<body>
struts2中的路径问题是根据action的路径而不是jsp路径来确定，所以尽量不要使用相对路径。<br />
<a href="<%=basePath %>index.jsp">index.jsp</a>
<br />
虽然可以用redirect方式解决，但redirect方式并非必要。
<br />
解决办法非常简单，统一使用绝对路径。（在jsp中用request.getContextRoot方式来拿到webapp的路径）
<br />
或者使用myeclipse经常用的，指定basePath
</body>
</html>