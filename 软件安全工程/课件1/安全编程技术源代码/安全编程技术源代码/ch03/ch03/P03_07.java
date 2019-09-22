public class P03_07{
	private int sum = 0;
	public static void main(String[] args) {
		new P03_07().cal();	
	}
	public void cal(){					//完成工作步骤
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();
		}
	class Thread1 extends Thread{
		public void run(){
			for(int i=1;i<=1000;i++){
				sum += i;
				try {
					Thread.sleep(1);	//暂停1毫秒
				}catch(Exception ex){}
			}
		}
	}
	class Thread2 extends Thread{
		public void run(){
			System.out.println("写入数据库:" + sum);
		}
	}
}
