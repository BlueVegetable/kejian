<%@ page language="java" pageEncoding="gb2312"%>
<html>
	<body>
	<%
		String code = request.getParameter("code");
		System.out.println(session.getAttribute("randStr"));
		String randStr = (String)session.getAttribute("randStr");
		if(!code.equals(randStr)){
			out.println("验证码错误！");
		}
		else{
			out.println("验证码正确!");
			//做其他事情
		}
	%>	
	</body>
</html>
