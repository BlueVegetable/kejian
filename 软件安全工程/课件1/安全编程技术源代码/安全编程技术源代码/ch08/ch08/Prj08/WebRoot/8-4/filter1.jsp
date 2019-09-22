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
欢迎查询书本
<form name="queryForm" action="filter1.jsp" method="post">
	请您输入书本的信息：<BR>
	<input name="book" type="text" size="50">
	<input type="button" value="查询" onClick="send()">	
</form>
<HR>
提交的书本：
<%
	String book = request.getParameter("book");
	if(book!=null){
		out.println(book);
	}
 %>


