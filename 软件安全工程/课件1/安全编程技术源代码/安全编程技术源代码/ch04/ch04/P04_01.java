import java.io.*;

public class P04_01{
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		/*用户输入一个数字*/
		System.out.print("请您输入一个数字：");
		String str = br.readLine();
		/*转换成double*/
		double number = Double.parseDouble(str);
		/*打印结果*/
		double result = number * number;
		System.out.println("结果是：" + result);
		System.out.println("程序运行完毕");
		}
	}