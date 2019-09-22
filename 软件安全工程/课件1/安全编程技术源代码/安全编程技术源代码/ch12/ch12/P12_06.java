import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class P12_06 {
	//SHA加密
	public static void main(String[] args) throws NoSuchAlgorithmException {
		try{
			String msg = "郭克华_安全编程技术";
			System.out.println("明文是：" + msg);
			MessageDigest md5 = MessageDigest.getInstance("SHA"); 
			byte[] srcBytes = msg.getBytes();
			md5.update(srcBytes); 
			byte[] resultBytes= md5.digest();
			String result = new String(resultBytes);
			System.out.println("密文是：" + result);
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}			
	}
}
