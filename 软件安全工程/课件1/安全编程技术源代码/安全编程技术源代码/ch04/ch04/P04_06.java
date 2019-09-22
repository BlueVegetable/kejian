public class P04_06{
	public static void main(String[] args){
		try{
			System.out.println("连接文件，读取文件");
			/*跳出函数*/
			return;
		}
		catch(Exception ex){
			System.out.println("处理异常");
		}
		/*此处没有finally*/
		System.out.println("关闭文件");		
		}
	}