import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class P12_05 {	
	// MD5加密
	public byte[] encrypt(String msg){
		try{			
			//根据MD5算法生成MessageDigest对象
			MessageDigest md5 = MessageDigest.getInstance("MD5"); 
			byte[] srcBytes = msg.getBytes();
			//使用srcBytes更新摘要
			md5.update(srcBytes); 
			//完成哈希计算,得到result
			byte[] resultBytes= md5.digest();
			return resultBytes;
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}			
		return null;
	}
	
	public static void main(String[] args)  {
			String msg = "郭克华_安全编程技术";
			System.out.println("明文是：" + msg);
			
			P12_05 p12_05 = new P12_05();
			byte[] resultBytes = p12_05.encrypt(msg);
			String result = new String(resultBytes);
			System.out.println("密文是：" + result);
	}
}
