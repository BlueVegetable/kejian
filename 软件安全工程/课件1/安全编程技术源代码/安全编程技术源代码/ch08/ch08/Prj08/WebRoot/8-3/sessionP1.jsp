<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//定义一个变量：
	String str = "12";
	int number = Integer.parseInt(str);
 %>
 该数字的平方为：<%=number*number %><HR>
 <%
 	//将str存入session
	session.setAttribute("number",str);
 %>
 <a href="sessionP2.jsp">到达sessionP2</a>