<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//����һ��������
	String str = "12";
	int number = Integer.parseInt(str);
 %>
 �����ֵ�ƽ��Ϊ��<%=number*number %><HR>
 <%
 	//��str����session
	session.setAttribute("number",str);
 %>
 <a href="sessionP2.jsp">����sessionP2</a>