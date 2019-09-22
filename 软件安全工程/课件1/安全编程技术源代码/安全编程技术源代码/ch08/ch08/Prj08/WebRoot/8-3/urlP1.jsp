<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//定义一个变量：
	String str = "12";
	int number = Integer.parseInt(str);
 %>
 该数字的平方为：<%=number*number %><HR>
 <a href="urlP2.jsp?number=<%=number %>">到达urlP2</a>
