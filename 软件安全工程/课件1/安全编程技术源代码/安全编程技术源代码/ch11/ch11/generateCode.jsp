<%@ page language="java"
	import="java.awt.*,java.awt.image.*,java.util.*,javax.imageio.*"
	pageEncoding="gb2312"%>
<%
	//response.setHeader("Cache-Control","no-cache"); 
	// ���ڴ��д���ͼ�� 
	int width = 60, height = 20;
	BufferedImage image = new BufferedImage(width, height,
			BufferedImage.TYPE_INT_RGB);
	// ��ȡͼ�������� 
	Graphics g = image.getGraphics();
	// �趨����ɫ 
	g.setColor(new Color(200, 200, 200));
	g.fillRect(0, 0, width, height);
	// ȡ�����������֤��(4λ����) 
	Random rnd = new Random();
	int randNum = rnd.nextInt(8999) + 1000;
	String randStr = String.valueOf(randNum);
	// ����֤�����SESSION 
	session.setAttribute("randStr", randStr);
	// ����֤����ʾ��ͼ���� 
	g.setColor(Color.black);
	g.setFont(new Font("", Font.PLAIN, 20));
	g.drawString(randStr, 10, 17);
	// �������100�����ŵ㣬ʹͼ���е���֤�벻�ױ���������̽�⵽ 
	for (int i = 0; i < 100; i++) {
		int x = rnd.nextInt(width);
		int y = rnd.nextInt(height);
		g.drawOval(x, y, 1, 1);
	}
	// ͼ����Ч 
	g.dispose();
	// ���ͼ��ҳ�� 
	ImageIO.write(image, "JPEG", response.getOutputStream());
	out.clear();
	out = pageContext.pushBody();
%>
