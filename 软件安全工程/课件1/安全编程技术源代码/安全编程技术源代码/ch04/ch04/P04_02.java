import java.io.*;

public class P04_02{
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
		catch(NumberFormatException ex){
			/*���������ʽ�쳣*/
			System.out.println("�Բ���������ĸ�ʽ����");
			}
		catch(IOException ex){
			/*����IO�쳣��ע�⣬�˴��Ǳ���Ҫ�����
			����ԭ����Բο�InputStreamReader��BufferedReader�ĵ�*/
			System.out.println("�Բ���IO�쳣");
			}
		catch(Exception ex){
			/*try�����л������������쳣*/
			System.out.println("�Բ��𣬳����쳣");
			}
						
		finally{
			System.out.println("�����������");
			}
		}
	}