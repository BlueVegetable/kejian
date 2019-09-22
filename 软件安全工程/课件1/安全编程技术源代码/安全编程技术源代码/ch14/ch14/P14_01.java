import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
/**
*数字签名，使用RSA私钥对消息摘要签名，
*然后使用公钥验证测试
*/
public class P14_01{
	public static void main(String[] args) throws Exception{
		String msg = "郭克华_安全编程技术";
		System.out.println("原文是:" + msg);
		
		byte[] msgBytes = msg.getBytes();
		
		//形成RSA密钥对
		KeyPairGenerator keyGen=KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(1024);
		//生成公钥和私钥对
		KeyPair key=keyGen.generateKeyPair();
		
		//实例化Signature，用于产生数字签名，指定用RSA和SHA算法 
		Signature sig=Signature.getInstance("SHA1WithRSA");
		//得到私钥
		PrivateKey privateKey = key.getPrivate();
		//用私钥来初始化数字签名对象
		sig.initSign(privateKey);
		//对msgBytes实施签名
		sig.update(msgBytes);
		//完成签名，将结果放入字节数组signatureBytes
		byte[] signatureBytes = sig.sign();
		
		String signature = new String(signatureBytes);
		System.out.println("签名是:" + signature);

		//使用公鈅验证
		PublicKey publicKey = key.getPublic();
		sig.initVerify(publicKey);
		//对msgBytes重新实施签名
		sig.update(msgBytes);
		try{
			if(sig.verify(signatureBytes)){
				System.out.println("签名验证成功");
			}
			else {
				System.out.println("签名验证失败");
			}
		}
		catch(SignatureException e){
			e.printStackTrace();
		}
	}
}
