<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//����һ��������
	String str = "12";
	int number = Integer.parseInt(str);
 %>
 �����ֵ�ƽ��Ϊ��<%=number*number %><HR>
 <a href="urlP2.jsp?number=<%=number %>">����urlP2</a>
