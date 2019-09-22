import java.io.*;

public class P04_02{
	public static void main(String[] args){
		try{
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
		}
		catch(NumberFormatException ex){
			/*处理输入格式异常*/
			System.out.println("对不起，您输入的格式错误");
			}
		catch(IOException ex){
			/*处理IO异常，注意，此处是必须要处理的
			具体原因可以参考InputStreamReader和BufferedReader文档*/
			System.out.println("对不起，IO异常");
			}
		catch(Exception ex){
			/*try代码中还可能有其他异常*/
			System.out.println("对不起，程序异常");
			}
						
		finally{
			System.out.println("程序运行完毕");
			}
		}
	}