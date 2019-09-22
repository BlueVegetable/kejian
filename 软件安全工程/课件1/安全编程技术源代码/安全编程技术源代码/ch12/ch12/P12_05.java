import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class P12_05 {	
	// MD5����
	public byte[] encrypt(String msg){
		try{			
			//����MD5�㷨����MessageDigest����
			MessageDigest md5 = MessageDigest.getInstance("MD5"); 
			byte[] srcBytes = msg.getBytes();
			//ʹ��srcBytes����ժҪ
			md5.update(srcBytes); 
			//��ɹ�ϣ����,�õ�result
			byte[] resultBytes= md5.digest();
			return resultBytes;
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}			
		return null;
	}
	
	public static void main(String[] args)  {
			String msg = "���˻�_��ȫ��̼���";
			System.out.println("�����ǣ�" + msg);
			
			P12_05 p12_05 = new P12_05();
			byte[] resultBytes = p12_05.encrypt(msg);
			String result = new String(resultBytes);
			System.out.println("�����ǣ�" + result);
	}
}
