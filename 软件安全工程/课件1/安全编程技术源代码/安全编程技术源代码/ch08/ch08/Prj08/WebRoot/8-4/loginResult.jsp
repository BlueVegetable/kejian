<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%//session检查
	String account = (String)session.getAttribute("account");
	if(account==null){
		response.sendRedirect("login.jsp");
	}
%>
欢迎<%=account%>来到邮箱！
<HR>
<a href="mailList.jsp">查看邮箱</a>
