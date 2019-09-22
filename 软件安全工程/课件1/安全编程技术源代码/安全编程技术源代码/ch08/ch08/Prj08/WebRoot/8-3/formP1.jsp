<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//定义一个变量：
	String str = "12";
	int number = Integer.parseInt(str);
 %>
 该数字的平方为：<%=number*number %><HR>
 <form action="formP2.jsp" method="post">
    <input type="hidden" name="number" value="<%=number %>">
 	<input type="submit" value="到达formP2">
 </form>
