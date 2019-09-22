import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class P12_07 {
	public static void main(String[] args) {
		//Ҫ������Ϣ��֤����ַ���
		String str="���˻�_��ȫ��̼���";
		System.out.println("������:" + str);
		try {
			//��DES�㷨�õ�������֤�����Կ
			KeyGenerator keyGen=KeyGenerator.getInstance("DESede");
			SecretKey key=keyGen.generateKey();
			byte[] keyByte=key.getEncoded();
			
			//����MAC����
			SecretKeySpec SKS=new SecretKeySpec(keyByte,"HMACMD5");
			Mac mac=Mac.getInstance("HMACMD5");
			mac.init(SKS);
			
			//����Ҫ������֤����ַ���
			mac.update(str.getBytes("UTF8"));
			
			//������֤��
			byte[] certifyCode=mac.doFinal();
			System.out.println("������:" + new String(certifyCode));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
