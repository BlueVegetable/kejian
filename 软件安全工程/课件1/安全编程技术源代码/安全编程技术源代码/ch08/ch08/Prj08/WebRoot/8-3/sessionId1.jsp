<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	String id = session.getId();
	out.println("当前sessionId为:" + id);
%>
<HR>
<a href="sessionId2.jsp">到达下一个页面</a>
