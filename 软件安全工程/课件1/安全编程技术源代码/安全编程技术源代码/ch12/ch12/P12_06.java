import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class P12_06 {
	//SHA����
	public static void main(String[] args) throws NoSuchAlgorithmException {
		try{
			String msg = "���˻�_��ȫ��̼���";
			System.out.println("�����ǣ�" + msg);
			MessageDigest md5 = MessageDigest.getInstance("SHA"); 
			byte[] srcBytes = msg.getBytes();
			md5.update(srcBytes); 
			byte[] resultBytes= md5.digest();
			String result = new String(resultBytes);
			System.out.println("�����ǣ�" + result);
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}			
	}
}
