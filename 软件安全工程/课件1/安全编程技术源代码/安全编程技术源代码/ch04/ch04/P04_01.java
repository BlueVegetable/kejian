import java.io.*;

public class P04_01{
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		/*�û�����һ������*/
		System.out.print("��������һ�����֣�");
		String str = br.readLine();
		/*ת����double*/
		double number = Double.parseDouble(str);
		/*��ӡ���*/
		double result = number * number;
		System.out.println("����ǣ�" + result);
		System.out.println("�����������");
		}
	}