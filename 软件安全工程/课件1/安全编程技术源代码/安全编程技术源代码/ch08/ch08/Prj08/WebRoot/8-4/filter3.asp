<%@ Language = "VBScript" %>
��ӭ��ѯ�鱾
<form name="queryForm" action="filter3.asp" method="post">
	���������鱾����Ϣ��<BR>
	<input name="book" type="text" size="50">
	<input type="submit" value="��ѯ">	
</form>
<HR>
�ύ���鱾��
<%
	book = Request("book")
	book = server.HTMLEncode(book)
%>
<%=book%>