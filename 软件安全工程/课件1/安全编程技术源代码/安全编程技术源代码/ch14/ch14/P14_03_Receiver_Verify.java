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

//���շ��÷��ͷ���public.key��֤����ǩ����
public class P14_03_Receiver_Verify {
	public static void main(String[] args) throws Exception {
		//	�����ļ�
		File file_info = new File("info.txt");
		FileInputStream fis_info = new FileInputStream(file_info);
		int fileInfoLength = (int)file_info.length();
		byte[] infoBytes = new byte[fileInfoLength];
		fis_info.read(infoBytes);
		fis_info.close();
		
		//	���뷢�ͷ���Կ
		FileInputStream fis_public = new FileInputStream("public.key");
		ObjectInputStream ois_public = new ObjectInputStream(fis_public);
		PublicKey publicKey = (PublicKey)ois_public.readObject();
		fis_public.close();
		ois_public.close();
		
		//	����ǩ���ļ�
		File file_signature = new File("signature.sgn");
		FileInputStream fis_signature = new FileInputStream(file_signature);
		int fileSignatureLength = (int)file_signature.length();
		byte[] signatureBytes = new byte[fileSignatureLength];
		fis_signature.read(signatureBytes);
		fis_signature.close();	
		
		//	ʹ�ù��_��֤
		Signature sig=Signature.getInstance("DSA");
		sig.initVerify(publicKey);
		sig.update(infoBytes);
		if(sig.verify(signatureBytes)){
			System.out.println("�ļ�û�б��۸�");
		}
		else{
			System.out.println("�ļ����۸�");
		}
	}
}