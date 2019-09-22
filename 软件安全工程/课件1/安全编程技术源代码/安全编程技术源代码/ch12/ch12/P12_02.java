import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class P12_02 {

      public static void main(String[] args) throws Exception{
		//KeyGenerator提供对称密钥生成器的功能，支持各种算法
     	KeyGenerator keygen;
	    //SecretKey负责保存对称密钥	
	    SecretKey deskey;	
	    //Cipher负责完成加密或解密工作
	    Cipher c;      	
      	Security.addProvider(new com.sun.crypto.provider.SunJCE());
        //实例化支持3DES算法的密钥生成器，算法名称用DESede
        keygen = KeyGenerator.getInstance("DESede");
        //生成密钥
        deskey = keygen.generateKey();
        //生成Cipher对象，指定其支持3DES算法
        c = Cipher.getInstance("DESede");                 
         
      	String msg = "郭克华_安全编程技术";
      	System.out.println("明文是：" + msg);
      	
        //根据密钥，对Cipher对象进行初始化,ENCRYPT_MODE表示加密模式
        c.init(Cipher.ENCRYPT_MODE, deskey);
        byte[] src = msg.getBytes();
        //加密，结果保存进enc
        byte[] enc = c.doFinal(src);
        System.out.println("密文是：" + new String(enc)); 
         
        //根据密钥，对Cipher对象进行初始化,ENCRYPT_MODE表示加密模式
        c.init(Cipher.DECRYPT_MODE, deskey);
        //解密，结果保存进dec
        byte[] dec = c.doFinal(enc);
      	System.out.println("解密后的结果是：" + new String(dec)); 
      }
}

