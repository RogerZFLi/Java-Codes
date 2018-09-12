<#assign s=JspTaglibs["/WEB-INF/struts-tags.tld"] />
<!DOCTYPE html>
<html>
	<head>
			
		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="description" content="This is my page">
	</head>
	<body>
		<h1>${companyName}</h1>
		<@s.form action="reg">
			<@s.textfield label="用户名" name="uname" />
			<@s.submit />
		<@s.form>
	</body>
</html>