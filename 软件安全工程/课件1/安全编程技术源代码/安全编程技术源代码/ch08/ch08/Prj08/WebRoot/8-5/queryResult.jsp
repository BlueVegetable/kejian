<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	//获取姓名
	String stuname = request.getParameter("stuname");
	if(stuname!=null&&!stuname.equals("")){
		String sql = "SELECT * FROM STUDENTS WHERE STUNAME LIKE '%" 
		                  + stuname 
		                  + "%'";
		out.println("数据库执行语句：<BR>" + sql);
	} 
	else{
		out.println("输入不正确！");
	}
%>