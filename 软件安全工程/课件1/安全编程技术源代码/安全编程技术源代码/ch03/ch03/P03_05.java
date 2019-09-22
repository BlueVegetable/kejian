class TicketRunnable implements Runnable{
		private int ticketNum = 3;	//��3��ƱΪ��
		public void run(){
			while(true){
				String tName = Thread.currentThread().getName();
				 //����Ҫ��ռCPU�Ĵ�����synchronized(this)��Χ����
			  synchronized(this){
				if(ticketNum<=0){
					System.out.println(tName + "��Ʊ");
					break;
					}
				else{
					try{
						Thread.sleep(1000);//��������1000����		
						}catch(Exception ex){}
			    	ticketNum--; //������1
					System.out.println(tName + "����һ��Ʊ,��ʣ" + ticketNum + "��Ʊ");
					}
			  }
			}
		}
	}
	
public class P03_05 {
	public static void main(String[] args){
		TicketRunnable tr = new TicketRunnable();
		Thread th1 = new Thread(tr,"�߳�1");
		Thread th2 = new Thread(tr,"�߳�2");
		th1.start();
		th2.start();
		}
}
