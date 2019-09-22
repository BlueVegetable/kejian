import java.awt.*;
import java.awt.event.*;

public class P03_13 extends Frame implements ActionListener,Runnable{
	private Button btn = new Button("暂停");
	private Thread th = new Thread(this);
	private boolean RUN = true;				//标志线程是否运行
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
		if(btn.getLabel().equals("打印")){
			th = new Thread(this);			//重开线程
			this.RUN = true;
			th.start();
			btn.setLabel("暂停");
			}
		else{
			this.RUN = false;				//让run函数中的循环终止
			th = null;
			btn.setLabel("打印");
			}		
		}
	public static void main(String[] args){
		new P03_13();
	}
}