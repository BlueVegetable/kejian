<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//��ȡ����
	String stuname = request.getParameter("stuname");
	if(stuname!=null&&!stuname.equals("")){
		String sql = "SELECT * FROM STUDENTS WHERE STUNAME LIKE '%" 
		                  + stuname 
		                  + "%'";
		out.println("���ݿ�ִ����䣺<BR>" + sql);
	} 
	else{
		out.println("���벻��ȷ��");
	}
%>