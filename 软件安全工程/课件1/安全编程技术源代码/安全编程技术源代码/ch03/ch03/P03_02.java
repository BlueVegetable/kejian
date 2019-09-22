class WelcomeThread extends Thread{
	public void run(){
		while(true){
			System.out.println("Welcome");
			try{	Thread.sleep(1000);	}catch(Exception ex){}
		}
		}
	}
public class P03_02{
	public static void main(String[] args){
		WelcomeThread wt = new WelcomeThread();
		wt.start();								//开启线程
		System.out.println("其他工作");			//代码行1
		}
	}