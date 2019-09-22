import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class P12_07 {
	public static void main(String[] args) {
		//要计算消息验证码的字符串
		String str="郭克华_安全编程技术";
		System.out.println("明文是:" + str);
		try {
			//用DES算法得到计算验证码的密钥
			KeyGenerator keyGen=KeyGenerator.getInstance("DESede");
			SecretKey key=keyGen.generateKey();
			byte[] keyByte=key.getEncoded();
			
			//生成MAC对象
			SecretKeySpec SKS=new SecretKeySpec(keyByte,"HMACMD5");
			Mac mac=Mac.getInstance("HMACMD5");
			mac.init(SKS);
			
			//传入要计算验证码的字符串
			mac.update(str.getBytes("UTF8"));
			
			//计算验证码
			byte[] certifyCode=mac.doFinal();
			System.out.println("密文是:" + new String(certifyCode));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
