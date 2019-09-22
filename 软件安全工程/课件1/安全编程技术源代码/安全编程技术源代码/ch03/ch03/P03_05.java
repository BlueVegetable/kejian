class TicketRunnable implements Runnable{
		private int ticketNum = 3;	//以3张票为例
		public void run(){
			while(true){
				String tName = Thread.currentThread().getName();
				 //将需要独占CPU的代码用synchronized(this)包围起来
			  synchronized(this){
				if(ticketNum<=0){
					System.out.println(tName + "无票");
					break;
					}
				else{
					try{
						Thread.sleep(1000);//程序休眠1000毫秒		
						}catch(Exception ex){}
			    	ticketNum--; //代码行1
					System.out.println(tName + "卖出一张票,还剩" + ticketNum + "张票");
					}
			  }
			}
		}
	}
	
public class P03_05 {
	public static void main(String[] args){
		TicketRunnable tr = new TicketRunnable();
		Thread th1 = new Thread(tr,"线程1");
		Thread th2 = new Thread(tr,"线程2");
		th1.start();
		th2.start();
		}
}
