class TicketRunnable implements Runnable{
		private int ticketNum = 3;	//��3��ƱΪ��
		public void run(){
			while(true){
				String tName = Thread.currentThread().getName();
				if(ticketNum<=0){
					System.out.println(tName + "��Ʊ");
					break;
					}
				else{
			    	ticketNum--; //������1
					System.out.println(tName + "����һ��Ʊ,��ʣ" + ticketNum + "��Ʊ");
					}
			}
		}
	}
	
public class P03_03 {
	public static void main(String[] args){
		TicketRunnable tr = new TicketRunnable();
		Thread th1 = new Thread(tr,"�߳�1");
		Thread th2 = new Thread(tr,"�߳�2");
		th1.start();
		th2.start();
		}
}
