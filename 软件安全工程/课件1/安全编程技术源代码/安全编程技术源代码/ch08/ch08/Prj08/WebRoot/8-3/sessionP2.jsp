<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//��session���number
	String str = (String)session.getAttribute("number");
	int number = Integer.parseInt(str);
 %>
 �����ֵ�����Ϊ��<%=number*number*number %><HR>
