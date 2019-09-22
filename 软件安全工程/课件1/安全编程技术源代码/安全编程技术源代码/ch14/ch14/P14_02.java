import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

public class P14_02 {
	
	private KeyPair key = null;
	Signature sig = null;
	public P14_02() throws NoSuchAlgorithmException{
		// �γ�DSA��Կ��
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
		keyGen.initialize(1024);
		// ���ɹ�Կ��˽Կ��
		key = keyGen.generateKeyPair();
		// ʵ����Signature�����ڲ�������ǩ����ָ����DSA�㷨
		sig = Signature.getInstance("DSA");
	}

	public byte[] getSignature(String msg) 
	     throws InvalidKeyException,SignatureException{
		byte[] msgBytes = msg.getBytes();	
		// �õ�˽Կ
		PrivateKey privateKey = key.getPrivate();
		// ��˽Կ����ʼ������ǩ������
		sig.initSign(privateKey);
		// ��msgBytesʵʩǩ��
		sig.update(msgBytes);
		// ���ǩ��������������ֽ�����signatureBytes
		byte[] signatureBytes = sig.sign();
		return signatureBytes;
	}
	
	public boolean verify(String msg, byte[] signatureBytes)
			throws InvalidKeyException,SignatureException{
		//ʹ�ù��_��֤
		PublicKey publicKey = key.getPublic();
		sig.initVerify(publicKey);
		byte[] msgBytes = msg.getBytes();	
		// ��msgBytes����ʵʩǩ��		
		sig.update(msgBytes);
		return sig.verify(signatureBytes);
	}

	public static void main(String[] args) throws Exception {
		String msg = "���˻�_��ȫ��̼���";
		System.out.println("ԭ����:" + msg);
		
		P14_02 p14_02 = new P14_02();
		byte[] signatureBytes = p14_02.getSignature(msg);		
		String signature = new String(signatureBytes);
		System.out.println("ǩ����:" + signature);

		boolean verifyResult = p14_02.verify(msg, signatureBytes);
			if (verifyResult) {
				System.out.println("ǩ����֤�ɹ�");
			} else {
				System.out.println("ǩ����֤ʧ��");
			}
	}
}