<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<script type="text/javascript">
 function filter(strTemp) { 
   strTemp = strTemp.replace(/<|>/g,""); 
   return strTemp;
}
function send(){
	document.queryForm.book.value = filter(document.queryForm.book.value);
    document.queryForm.submit();
}
</script>
��ӭ��ѯ�鱾
<form name="queryForm" action="filter1.jsp" method="post">
	���������鱾����Ϣ��<BR>
	<input name="book" type="text" size="50">
	<input type="button" value="��ѯ" onClick="send()">	
</form>
<HR>
�ύ���鱾��
<%
	String book = request.getParameter("book");
	if(book!=null){
		out.println(book);
	}
 %>


