import java.awt.*;
import java.awt.event.*;

public class P03_13 extends Frame implements ActionListener,Runnable{
	private Button btn = new Button("��ͣ");
	private Thread th = new Thread(this);
	private boolean RUN = true;				//��־�߳��Ƿ�����
	public P03_13(){
		this.add(btn);
		this.pack();
		btn.addActionListener(this);
		this.setVisible(true);		
		th.start();
		}
	public void run(){
		while(RUN){
			System.out.println("WELCOME");
			try{ Thread.sleep(1000); }
			catch(Exception ex){}			
			}
	}
	public void actionPerformed(ActionEvent e){
		if(btn.getLabel().equals("��ӡ")){
			th = new Thread(this);			//�ؿ��߳�
			this.RUN = true;
			th.start();
			btn.setLabel("��ͣ");
			}
		else{
			this.RUN = false;				//��run�����е�ѭ����ֹ
			th = null;
			btn.setLabel("��ӡ");
			}		
		}
	public static void main(String[] args){
		new P03_13();
	}
}