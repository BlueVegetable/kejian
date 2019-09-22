import java.awt.Color;
import java.awt.Frame;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.PropertyResourceBundle;

public class P06_01 extends Frame{
	private String 	welcomeText; 		//��ӭ��Ϣ
	//ϵͳ�������ƣ�������Ϊzh_CN,Ӣ��(����)Ϊen_US��
	private String  locale;				
	public P06_01() throws Exception{
		locale = Locale.getDefault().toString();	//�õ�ϵͳ����
		FileInputStream fis = //�����ļ�
			new FileInputStream("messageResource_" + locale + ".properties");
		PropertyResourceBundle prb = new PropertyResourceBundle(fis);
		welcomeText = prb.getString("welcomeMessage");	//�����Ӧ�ļ��е�����
		this.setTitle(welcomeText);						//���ñ���
		this.setBackground(Color.yellow);
		this.setSize(300,200);
		this.setVisible(true);		
	}
	public static void main(String[] args) throws Exception {
		P06_01 p06_01 = new P06_01();
	}
}
