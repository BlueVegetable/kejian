<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//定义一个变量：
	String str = "12";
	int number = Integer.parseInt(str);
 %>
 该数字的平方为：<%=number*number %><HR>
 <%
 	//将str存入Cookie
 	Cookie cookie = new Cookie("number",str);
 	//设置Cookie的存活期为600秒
 	cookie.setMaxAge(600);
 	//将Cookie保存于客户端
 	response.addCookie(cookie);
 %>
 <a href="cookieP2.jsp">到达cookieP2</a>