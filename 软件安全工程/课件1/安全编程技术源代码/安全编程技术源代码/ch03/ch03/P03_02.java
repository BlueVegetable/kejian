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
		wt.start();								//�����߳�
		System.out.println("��������");			//������1
		}
	}