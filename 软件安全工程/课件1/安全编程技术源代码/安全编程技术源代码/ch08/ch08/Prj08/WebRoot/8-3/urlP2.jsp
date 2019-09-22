<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//获得number
	String str = request.getParameter("number");
	int number = Integer.parseInt(str);
 %>
 该数字的立方为：<%=number*number*number %><HR>
