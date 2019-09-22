import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;

public class P12_04{ 
	//RSA���ܽ���
	public static void main(String[] args) { 
		try { 
			P12_04 p12_04 = new P12_04(); 
			String msg = "���˻�_��ȫ��̼���"; 
			System.out.println("������:" + msg);
			//KeyPairGenerator ���������ɹ�Կ��˽Կ�ԣ�����RSA�㷨���ɶ���
			KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA"); 
			//��ʼ����Կ��������,��Կ��СΪ1024λ
			keyPairGen.initialize(1024); 
			//����һ����Կ�ԣ�������keyPair��
			KeyPair keyPair = keyPairGen.generateKeyPair(); 
			// �õ�˽Կ
			RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate(); 
			//�õ���Կ
			RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic(); 			
			
			//�ù�Կ����
			byte[] srcBytes = msg.getBytes(); 
			byte[] resultBytes = p12_04.encrypt(publicKey, srcBytes); 
			String result = new String(resultBytes);
			System.out.println("�ù�Կ���ܺ�������:" + result);
			
			//��˽Կ����
			byte[] decBytes = p12_04.decrypt(privateKey,resultBytes); 
			String dec = new String(decBytes);
			System.out.println("��˽Կ���ܺ�����:" + dec);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

	protected byte[] encrypt(RSAPublicKey publicKey, byte[] srcBytes){ 
		if (publicKey != null) { 
			try{ 
				//Cipher������ɼ��ܻ���ܹ���������RSA
				Cipher cipher = Cipher.getInstance("RSA"); 
				 //���ݹ�Կ����Cipher������г�ʼ��
				cipher.init(Cipher.ENCRYPT_MODE, publicKey); 
				//	���ܣ���������resultBytes
				byte[] resultBytes  = cipher.doFinal(srcBytes);
				return resultBytes;
			} catch (Exception e){ 
				e.printStackTrace(); 
			} 
		} 
		return null; 
	}

	protected byte[] decrypt(RSAPrivateKey privateKey, byte[] encBytes) { 
		if (privateKey != null) { 
			try { 
				Cipher cipher = Cipher.getInstance("RSA"); 
				//����˽Կ����Cipher������г�ʼ��
				cipher.init(Cipher.DECRYPT_MODE, privateKey); 
				//���ܣ���������resultBytes
				byte[] decBytes  = cipher.doFinal(encBytes);
				return decBytes;
			} catch (Exception e) { 
				e.printStackTrace(); 
			} 
		} 
		return null; 
	} 
}
