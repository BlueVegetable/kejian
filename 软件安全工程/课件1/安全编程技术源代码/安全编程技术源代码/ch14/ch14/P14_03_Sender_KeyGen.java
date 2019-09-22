import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

/*发送方生成一个公钥一个私钥，分别保存为文件：public.key和private.key*/
public class P14_03_Sender_KeyGen {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos_public = new FileOutputStream("public.key");
		ObjectOutputStream oos_public = new ObjectOutputStream(fos_public);
		FileOutputStream fos_private = new FileOutputStream("private.key");
		ObjectOutputStream oos_private = new ObjectOutputStream(fos_private);
		// 形成DSA公钥对
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
		keyGen.initialize(1024);
		// 生成公钥和私钥对
		KeyPair key = keyGen.generateKeyPair();
		PublicKey publicKey = key.getPublic();
		PrivateKey privateKey = key.getPrivate();
		//写入文件
		oos_public.writeObject(publicKey);
		oos_private.writeObject(privateKey);
		fos_public.close();
		oos_public.close();
		fos_private.close();
		oos_private.close();
	}
}