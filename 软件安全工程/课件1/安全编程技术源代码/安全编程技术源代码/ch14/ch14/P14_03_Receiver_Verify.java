import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

//接收方用发送方的public.key验证数字签名。
public class P14_03_Receiver_Verify {
	public static void main(String[] args) throws Exception {
		//	读入文件
		File file_info = new File("info.txt");
		FileInputStream fis_info = new FileInputStream(file_info);
		int fileInfoLength = (int)file_info.length();
		byte[] infoBytes = new byte[fileInfoLength];
		fis_info.read(infoBytes);
		fis_info.close();
		
		//	读入发送方公钥
		FileInputStream fis_public = new FileInputStream("public.key");
		ObjectInputStream ois_public = new ObjectInputStream(fis_public);
		PublicKey publicKey = (PublicKey)ois_public.readObject();
		fis_public.close();
		ois_public.close();
		
		//	读入签名文件
		File file_signature = new File("signature.sgn");
		FileInputStream fis_signature = new FileInputStream(file_signature);
		int fileSignatureLength = (int)file_signature.length();
		byte[] signatureBytes = new byte[fileSignatureLength];
		fis_signature.read(signatureBytes);
		fis_signature.close();	
		
		//	使用公鈅验证
		Signature sig=Signature.getInstance("DSA");
		sig.initVerify(publicKey);
		sig.update(infoBytes);
		if(sig.verify(signatureBytes)){
			System.out.println("文件没有被篡改");
		}
		else{
			System.out.println("文件被篡改");
		}
	}
}