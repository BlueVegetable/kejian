<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	if(session.getAttribute("account")==null){
		response.sendRedirect("login.jsp");
	}
%>
欢迎
<%=session.getAttribute("account")%>
来到邮箱！
<HR>
请进行如下操作：......
