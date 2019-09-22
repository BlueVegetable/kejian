<%@ Language = "VBScript" %>
欢迎查询书本
<form name="queryForm" action="filter3.asp" method="post">
	请您输入书本的信息：<BR>
	<input name="book" type="text" size="50">
	<input type="submit" value="查询">	
</form>
<HR>
提交的书本：
<%
	book = Request("book")
	book = server.HTMLEncode(book)
%>
<%=book%>