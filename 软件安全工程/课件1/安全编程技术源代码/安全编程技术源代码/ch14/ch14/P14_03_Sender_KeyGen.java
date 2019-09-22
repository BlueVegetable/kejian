import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

/*���ͷ�����һ����Կһ��˽Կ���ֱ𱣴�Ϊ�ļ���public.key��private.key*/
public class P14_03_Sender_KeyGen {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos_public = new FileOutputStream("public.key");
		ObjectOutputStream oos_public = new ObjectOutputStream(fos_public);
		FileOutputStream fos_private = new FileOutputStream("private.key");
		ObjectOutputStream oos_private = new ObjectOutputStream(fos_private);
		// �γ�DSA��Կ��
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
		keyGen.initialize(1024);
		// ���ɹ�Կ��˽Կ��
		KeyPair key = keyGen.generateKeyPair();
		PublicKey publicKey = key.getPublic();
		PrivateKey privateKey = key.getPrivate();
		//д���ļ�
		oos_public.writeObject(publicKey);
		oos_private.writeObject(privateKey);
		fos_public.close();
		oos_public.close();
		fos_private.close();
		oos_private.close();
	}
}