
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
具体视图的返回可以由用户自己定义的Action来决定<br />
具体的手段是根据返回的字符串找到对应的配置项，来决定视图的内容<br />
具体Action的实现可以是一个普通的java类，里面有public String execute方法即可<br />
或者实现Action接口<br />
不过最常用的是从ActionSupport继承，好处在于可以直接使用Struts2封装好的方法<br />
</body>
</html>