import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.security.PrivateKey;
import java.security.Signature;

/*任给一个信息文件info.txt，发送方用public.key生成数字签名（已加密），
 * 将签名存放于signature.sgn*/
public class P14_03_Sender_SgnGen {

	public static void main(String[] args) throws Exception {
		//读入文件
		File file_info = new File("info.txt");
		FileInputStream fis_info = new FileInputStream(file_info);
		int fileInfoLength = (int)file_info.length();
		byte[] infoBytes = new byte[fileInfoLength];
		fis_info.read(infoBytes);
		fis_info.close();
		
		//发送方读入私钥
		FileInputStream fis_private = new FileInputStream("private.key");
		ObjectInputStream ois_private = new ObjectInputStream(fis_private);
		PrivateKey privateKey = (PrivateKey)ois_private.readObject();
		fis_private.close();
		ois_private.close();
		
		//生成签名		
		Signature sig=Signature.getInstance("DSA");
		//用私钥来初始化数字签名对象
		sig.initSign(privateKey);
		//对msgBytes实施签名
		sig.update(infoBytes);
		//完成签名，将结果放入字节数组signatureBytes
		byte[] signatureBytes = sig.sign();
		
		//将签名写入文件signature.sgn
		FileOutputStream fos_signature = new FileOutputStream("signature.sgn");
		fos_signature.write(signatureBytes);
		fos_signature.close();
	}
}