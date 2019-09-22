<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//»ñÈ¡ÕËºÅÃÜÂë
	String account = request.getParameter("account");
	String password = request.getParameter("password");
	if(account!=null){
		//ÑéÖ¤ÕËºÅÃÜÂë
		String sql = "SELECT * FROM USERS WHERE ACCOUNT='" + account + "' AND PASSWORD='" + password + "'";
		out.println("Êý¾Ý¿âÖ´ÐÐÓï¾ä£º<BR>" + sql);
	} 
%>