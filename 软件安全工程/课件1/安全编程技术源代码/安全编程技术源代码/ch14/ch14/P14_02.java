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
		// 形成DSA公钥对
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
		keyGen.initialize(1024);
		// 生成公钥和私钥对
		key = keyGen.generateKeyPair();
		// 实例化Signature，用于产生数字签名，指定用DSA算法
		sig = Signature.getInstance("DSA");
	}

	public byte[] getSignature(String msg) 
	     throws InvalidKeyException,SignatureException{
		byte[] msgBytes = msg.getBytes();	
		// 得到私钥
		PrivateKey privateKey = key.getPrivate();
		// 用私钥来初始化数字签名对象
		sig.initSign(privateKey);
		// 对msgBytes实施签名
		sig.update(msgBytes);
		// 完成签名，将结果放入字节数组signatureBytes
		byte[] signatureBytes = sig.sign();
		return signatureBytes;
	}
	
	public boolean verify(String msg, byte[] signatureBytes)
			throws InvalidKeyException,SignatureException{
		//使用公鈅验证
		PublicKey publicKey = key.getPublic();
		sig.initVerify(publicKey);
		byte[] msgBytes = msg.getBytes();	
		// 对msgBytes重新实施签名		
		sig.update(msgBytes);
		return sig.verify(signatureBytes);
	}

	public static void main(String[] args) throws Exception {
		String msg = "郭克华_安全编程技术";
		System.out.println("原文是:" + msg);
		
		P14_02 p14_02 = new P14_02();
		byte[] signatureBytes = p14_02.getSignature(msg);		
		String signature = new String(signatureBytes);
		System.out.println("签名是:" + signature);

		boolean verifyResult = p14_02.verify(msg, signatureBytes);
			if (verifyResult) {
				System.out.println("签名验证成功");
			} else {
				System.out.println("签名验证失败");
			}
	}
}