<%@ page language="java" pageEncoding="gb2312"%>
<html>
	<body>
	<form action="loginResult.jsp">
		用户名:<input type="text" name="account" /><BR>
		密  码: <input type="password" name="password" /><BR>
		验证码:<input type="text" name="code" size="10">
		<img border=0 src="generateCode.jsp">
		<input type="submit" value="登录">	
	</form>		
	</body>
</html>
