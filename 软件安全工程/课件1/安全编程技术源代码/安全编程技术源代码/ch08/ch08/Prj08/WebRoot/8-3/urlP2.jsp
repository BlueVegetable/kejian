<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//���number
	String str = request.getParameter("number");
	int number = Integer.parseInt(str);
 %>
 �����ֵ�����Ϊ��<%=number*number*number %><HR>
