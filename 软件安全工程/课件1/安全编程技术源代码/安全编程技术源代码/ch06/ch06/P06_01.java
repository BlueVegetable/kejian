import java.awt.Color;
import java.awt.Frame;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.PropertyResourceBundle;

public class P06_01 extends Frame{
	private String 	welcomeText; 		//欢迎信息
	//系统语言名称，如中文为zh_CN,英语(美国)为en_US等
	private String  locale;				
	public P06_01() throws Exception{
		locale = Locale.getDefault().toString();	//得到系统语言
		FileInputStream fis = //载入文件
			new FileInputStream("messageResource_" + locale + ".properties");
		PropertyResourceBundle prb = new PropertyResourceBundle(fis);
		welcomeText = prb.getString("welcomeMessage");	//获得相应文件中的内容
		this.setTitle(welcomeText);						//设置标题
		this.setBackground(Color.yellow);
		this.setSize(300,200);
		this.setVisible(true);		
	}
	public static void main(String[] args) throws Exception {
		P06_01 p06_01 = new P06_01();
	}
}
