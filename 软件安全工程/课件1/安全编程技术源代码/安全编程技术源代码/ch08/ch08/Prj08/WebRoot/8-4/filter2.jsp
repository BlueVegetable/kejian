<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>

欢迎查询书本
<form name="queryForm" action="filter2.jsp" method="post">
	请您输入书本的信息：<BR>
	<input name="book" type="text" size="50">
	<input type="submit" value="查询">	
</form>
<HR>
提交的书本：
<%
	String book = request.getParameter("book");
	if(book!=null){
	    book = book.replaceAll("<|>","");
		out.println(book);
	}
 %>


