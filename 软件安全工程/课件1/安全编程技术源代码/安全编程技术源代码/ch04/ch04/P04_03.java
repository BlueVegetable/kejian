import java.io.*;

public class P04_03{
	public static void main(String[] args){
		try{
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
		}
		catch(Exception ex){
			/*�˴��Ӽ�*/
			System.out.println("�Բ��𣬳����쳣");
			}						
		finally{
			System.out.println("�����������");
			}
		}
	}