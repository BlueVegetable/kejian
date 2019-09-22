<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
欢迎登录邮箱
<form action="login.jsp" method="post">
	请您输入账号：<input name="account" type="text"><BR>
	请您输入密码：<input name="password" type="password"><BR>
	<input type="submit" value="登录">	
</form>
<%
	//获取账号密码
	String account = request.getParameter("account");
	String password = request.getParameter("password");
	if(account!=null){
		//验证账号密码，假如账号密码相同表示登录成功
		if(account.equals(password)){
			//放入session,跳转到下一个页面
			session.setAttribute("account",account);	
			response.sendRedirect("loginResult.jsp");
		}
		else{
			out.println("登录不成功");
		}
	}
%>
