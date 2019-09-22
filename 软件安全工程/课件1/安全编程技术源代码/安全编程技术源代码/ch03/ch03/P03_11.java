public class P03_11 implements Runnable{
	static Object S1 = new Object(),S2=new Object();
	public void run(){
		if(Thread.currentThread().getName().equals("th1")){
			synchronized(S1){
				System.out.println("线程1锁定S1"); 		//代码段1
				try{ Thread.sleep(1000); }
				catch(Exception ex){}
				synchronized(S2){
					System.out.println("线程1锁定S2");	//代码段2
				}
			}
		}
		else{
			synchronized(S2){
				System.out.println("线程2锁定S2");		//代码段3
				synchronized(S1){
					System.out.println("线程2锁定S1");	//代码段4
				}
			}
		}
}
	public static void main(String[] args){
		Thread t1 = new Thread(new P03_11(),"th1");
		Thread t2 = new Thread(new P03_11(),"th2");
		t1.start();
		t2.start();
	}
}