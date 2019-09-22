import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.security.PrivateKey;
import java.security.Signature;

/*�θ�һ����Ϣ�ļ�info.txt�����ͷ���public.key��������ǩ�����Ѽ��ܣ���
 * ��ǩ�������signature.sgn*/
public class P14_03_Sender_SgnGen {

	public static void main(String[] args) throws Exception {
		//�����ļ�
		File file_info = new File("info.txt");
		FileInputStream fis_info = new FileInputStream(file_info);
		int fileInfoLength = (int)file_info.length();
		byte[] infoBytes = new byte[fileInfoLength];
		fis_info.read(infoBytes);
		fis_info.close();
		
		//���ͷ�����˽Կ
		FileInputStream fis_private = new FileInputStream("private.key");
		ObjectInputStream ois_private = new ObjectInputStream(fis_private);
		PrivateKey privateKey = (PrivateKey)ois_private.readObject();
		fis_private.close();
		ois_private.close();
		
		//����ǩ��		
		Signature sig=Signature.getInstance("DSA");
		//��˽Կ����ʼ������ǩ������
		sig.initSign(privateKey);
		//��msgBytesʵʩǩ��
		sig.update(infoBytes);
		//���ǩ��������������ֽ�����signatureBytes
		byte[] signatureBytes = sig.sign();
		
		//��ǩ��д���ļ�signature.sgn
		FileOutputStream fos_signature = new FileOutputStream("signature.sgn");
		fos_signature.write(signatureBytes);
		fos_signature.close();
	}
}