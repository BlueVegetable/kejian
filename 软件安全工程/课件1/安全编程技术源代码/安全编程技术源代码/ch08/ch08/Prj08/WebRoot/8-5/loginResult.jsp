<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//��ȡ�˺�����
	String account = request.getParameter("account");
	String password = request.getParameter("password");
	if(account!=null){
		//��֤�˺�����
		String sql = "SELECT * FROM USERS WHERE ACCOUNT='" + account + "' AND PASSWORD='" + password + "'";
		out.println("���ݿ�ִ����䣺<BR>" + sql);
	} 
%>