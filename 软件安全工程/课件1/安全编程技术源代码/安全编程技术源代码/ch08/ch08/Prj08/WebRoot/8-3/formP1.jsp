<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//����һ��������
	String str = "12";
	int number = Integer.parseInt(str);
 %>
 �����ֵ�ƽ��Ϊ��<%=number*number %><HR>
 <form action="formP2.jsp" method="post">
    <input type="hidden" name="number" value="<%=number %>">
 	<input type="submit" value="����formP2">
 </form>
