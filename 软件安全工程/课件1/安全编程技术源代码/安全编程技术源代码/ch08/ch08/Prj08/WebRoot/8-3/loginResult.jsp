<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	if(session.getAttribute("account")==null){
		response.sendRedirect("login.jsp");
	}
%>
��ӭ
<%=session.getAttribute("account")%>
�������䣡
<HR>
��������²�����......
