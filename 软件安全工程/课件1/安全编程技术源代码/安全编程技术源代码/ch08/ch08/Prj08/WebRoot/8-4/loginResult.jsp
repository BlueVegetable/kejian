<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%//session���
	String account = (String)session.getAttribute("account");
	if(account==null){
		response.sendRedirect("login.jsp");
	}
%>
��ӭ<%=account%>�������䣡
<HR>
<a href="mailList.jsp">�鿴����</a>
