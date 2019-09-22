import java.awt.*;
import java.applet.*;
public class P10_02 extends Applet{
     public void paint(Graphics g ) {
          g.setColor(Color.blue);
          g.drawRoundRect(45,35,250,20,10,10); 
          g.setColor(Color.red);
          g.drawString("这是一个Applet!",100,50);
     }
}
