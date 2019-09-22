import java.awt.*;
import java.awt.event.*;

public class P03_12 extends Frame implements ActionListener,Runnable{
	private Button btn = new Button("‘›Õ£");
	private Thread th = new Thread(this);
	public P03_12(){
		this.add(btn);
		this.pack();
		btn.addActionListener(this);
		this.setVisible(true);		
		th.start();
		}
	public void run(){
		while(true){
			System.out.println("WELCOME");
			try{ Thread.sleep(1000); }
			catch(Exception ex){}			
			}
	}
	public void actionPerformed(ActionEvent e){
		if(btn.getLabel().equals("¥Ú”°")){
			th.resume();
			btn.setLabel("‘›Õ£");
			}
		else{
			th.suspend();
			btn.setLabel("¥Ú”°");
			}		
		}
	public static void main(String[] args){
		new P03_12();
	}
}