<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>

��ӭ��ѯ�鱾
<form name="queryForm" action="filter2.jsp" method="post">
	���������鱾����Ϣ��<BR>
	<input name="book" type="text" size="50">
	<input type="submit" value="��ѯ">	
</form>
<HR>
�ύ���鱾��
<%
	String book = request.getParameter("book");
	if(book!=null){
	    book = book.replaceAll("<|>","");
		out.println(book);
	}
 %>


