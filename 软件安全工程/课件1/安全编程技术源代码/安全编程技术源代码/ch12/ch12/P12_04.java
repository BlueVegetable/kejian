import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;

public class P12_04{ 
	//RSA加密解密
	public static void main(String[] args) { 
		try { 
			P12_04 p12_04 = new P12_04(); 
			String msg = "郭克华_安全编程技术"; 
			System.out.println("明文是:" + msg);
			//KeyPairGenerator 类用于生成公钥和私钥对，基于RSA算法生成对象
			KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA"); 
			//初始化密钥对生成器,密钥大小为1024位
			keyPairGen.initialize(1024); 
			//生成一个密钥对，保存在keyPair中
			KeyPair keyPair = keyPairGen.generateKeyPair(); 
			// 得到私钥
			RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate(); 
			//得到公钥
			RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic(); 			
			
			//用公钥加密
			byte[] srcBytes = msg.getBytes(); 
			byte[] resultBytes = p12_04.encrypt(publicKey, srcBytes); 
			String result = new String(resultBytes);
			System.out.println("用公钥加密后密文是:" + result);
			
			//用私钥解密
			byte[] decBytes = p12_04.decrypt(privateKey,resultBytes); 
			String dec = new String(decBytes);
			System.out.println("用私钥解密后结果是:" + dec);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

	protected byte[] encrypt(RSAPublicKey publicKey, byte[] srcBytes){ 
		if (publicKey != null) { 
			try{ 
				//Cipher负责完成加密或解密工作，基于RSA
				Cipher cipher = Cipher.getInstance("RSA"); 
				 //根据公钥，对Cipher对象进行初始化
				cipher.init(Cipher.ENCRYPT_MODE, publicKey); 
				//	加密，结果保存进resultBytes
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
				//根据私钥，对Cipher对象进行初始化
				cipher.init(Cipher.DECRYPT_MODE, privateKey); 
				//解密，结果保存进resultBytes
				byte[] decBytes  = cipher.doFinal(encBytes);
				return decBytes;
			} catch (Exception e) { 
				e.printStackTrace(); 
			} 
		} 
		return null; 
	} 
}
