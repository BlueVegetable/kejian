import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class P12_03 {
	public static void main(String[] args) throws Exception{
		//KeyGenerator�ṩ�Գ���Կ�������Ĺ��ܣ�֧�ָ����㷨
     	KeyGenerator keygen;
	    //SecretKey���𱣴�Գ���Կ	
	    SecretKey deskey;	
	    //Cipher������ɼ��ܻ���ܹ���
	    Cipher c;      	
      	Security.addProvider(new com.sun.crypto.provider.SunJCE());
        //ʵ����֧��AES�㷨����Կ���������㷨������AES
        keygen = KeyGenerator.getInstance("AES");
        //������Կ
        deskey = keygen.generateKey();
        //����Cipher����ָ����֧��AES�㷨
        c = Cipher.getInstance("AES");                 
         
      	String msg = "���˻�_��ȫ��̼���";
      	System.out.println("�����ǣ�" + msg);
      	
        //������Կ����Cipher������г�ʼ��,ENCRYPT_MODE��ʾ����ģʽ
        c.init(Cipher.ENCRYPT_MODE, deskey);
        byte[] src = msg.getBytes();
        //���ܣ���������enc
        byte[] enc = c.doFinal(src);
        System.out.println("�����ǣ�" + new String(enc)); 
         
        //������Կ����Cipher������г�ʼ��,ENCRYPT_MODE��ʾ����ģʽ
        c.init(Cipher.DECRYPT_MODE, deskey);
        //���ܣ���������dec
        byte[] dec = c.doFinal(enc);
      	System.out.println("���ܺ�Ľ���ǣ�" + new String(dec)); 
      }
}

