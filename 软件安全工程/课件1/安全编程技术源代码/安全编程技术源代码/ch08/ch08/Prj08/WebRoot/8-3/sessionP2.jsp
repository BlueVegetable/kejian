<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//从session获得number
	String str = (String)session.getAttribute("number");
	int number = Integer.parseInt(str);
 %>
 该数字的立方为：<%=number*number*number %><HR>
