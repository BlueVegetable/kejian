<%@ page language="java" pageEncoding="gb2312"%>
<html>
	<body>
	<%
		String code = request.getParameter("code");
		System.out.println(session.getAttribute("randStr"));
		String randStr = (String)session.getAttribute("randStr");
		if(!code.equals(randStr)){
			out.println("��֤�����");
		}
		else{
			out.println("��֤����ȷ!");
			//����������
		}
	%>	
	</body>
</html>
