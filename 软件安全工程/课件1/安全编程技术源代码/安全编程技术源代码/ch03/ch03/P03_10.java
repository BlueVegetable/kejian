public class P03_10 implements Runnable{
	static Object S1 = new Object(),S2=new Object();
	public void run(){
		if(Thread.currentThread().getName().equals("th1")){
			synchronized(S1){
				System.out.println("�߳�1����S1"); 		//�����1
				synchronized(S2){
					System.out.println("�߳�1����S2");	//�����2
				}
			}
		}
		else{
			synchronized(S2){
				System.out.println("�߳�2����S2");		//�����3
				synchronized(S1){
					System.out.println("�߳�2����S1");	//�����4
				}
			}
		}
}
	public static void main(String[] args){
		Thread t1 = new Thread(new P03_10(),"th1");
		Thread t2 = new Thread(new P03_10(),"th2");
		t1.start();
		t2.start();
	}
}