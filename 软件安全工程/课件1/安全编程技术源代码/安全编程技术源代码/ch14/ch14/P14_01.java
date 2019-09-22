import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
/**
*����ǩ����ʹ��RSA˽Կ����ϢժҪǩ����
*Ȼ��ʹ�ù�Կ��֤����
*/
public class P14_01{
	public static void main(String[] args) throws Exception{
		String msg = "���˻�_��ȫ��̼���";
		System.out.println("ԭ����:" + msg);
		
		byte[] msgBytes = msg.getBytes();
		
		//�γ�RSA��Կ��
		KeyPairGenerator keyGen=KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(1024);
		//���ɹ�Կ��˽Կ��
		KeyPair key=keyGen.generateKeyPair();
		
		//ʵ����Signature�����ڲ�������ǩ����ָ����RSA��SHA�㷨 
		Signature sig=Signature.getInstance("SHA1WithRSA");
		//�õ�˽Կ
		PrivateKey privateKey = key.getPrivate();
		//��˽Կ����ʼ������ǩ������
		sig.initSign(privateKey);
		//��msgBytesʵʩǩ��
		sig.update(msgBytes);
		//���ǩ��������������ֽ�����signatureBytes
		byte[] signatureBytes = sig.sign();
		
		String signature = new String(signatureBytes);
		System.out.println("ǩ����:" + signature);

		//ʹ�ù��_��֤
		PublicKey publicKey = key.getPublic();
		sig.initVerify(publicKey);
		//��msgBytes����ʵʩǩ��
		sig.update(msgBytes);
		try{
			if(sig.verify(signatureBytes)){
				System.out.println("ǩ����֤�ɹ�");
			}
			else {
				System.out.println("ǩ����֤ʧ��");
			}
		}
		catch(SignatureException e){
			e.printStackTrace();
		}
	}
}
