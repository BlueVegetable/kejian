import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

public class P12_01 {	
	 //KeyGenerator�ṩ�Գ���Կ�������Ĺ��ܣ�֧�ָ����㷨
     private KeyGenerator keygen;
     //SecretKey���𱣴�Գ���Կ	
     private SecretKey deskey;	
     //Cipher������ɼ��ܻ���ܹ���
     private Cipher c;
     //���ֽ����鸺�𱣴���ܵĽ��
     private byte[] cipherByte;		

     public P12_01() {
     	 Security.addProvider(new com.sun.crypto.provider.SunJCE());
         try {
         	//ʵ����֧��DES�㷨����Կ������(�㷨���������谴�涨�������׳��쳣)
            keygen = KeyGenerator.getInstance("DES");
            //������Կ
            deskey = keygen.generateKey();
            //����Cipher����ָ����֧��DES�㷨
            c = Cipher.getInstance("DES");
          }
          catch(NoSuchAlgorithmException ex){
             ex.printStackTrace();
         }
          catch(NoSuchPaddingException ex){
             ex.printStackTrace();
         }
     }
	 /*���ַ���str����*/
     public byte[] createEncryptor(String str) {
         try {
         	  //������Կ����Cipher������г�ʼ��,ENCRYPT_MODE��ʾ����ģʽ
              c.init(Cipher.ENCRYPT_MODE, deskey);
              byte[] src = str.getBytes();
              //���ܣ���������cipherByte
              cipherByte = c.doFinal(src);
         }
         catch(java.security.InvalidKeyException ex){
             ex.printStackTrace();
         }
         catch(javax.crypto.BadPaddingException ex){
             ex.printStackTrace();
         }
         catch(javax.crypto.IllegalBlockSizeException ex){
             ex.printStackTrace();
         }
         return cipherByte;
      }
       /*���ֽ�����buff����*/
      public byte[] createDecryptor(byte[] buff) {
         try {
         	//������Կ����Cipher������г�ʼ��,ENCRYPT_MODE��ʾ����ģʽ
            c.init(Cipher.DECRYPT_MODE, deskey);
            //�õ����ģ�����cipherByte�ַ�����
            cipherByte = c.doFinal(buff);
         }
         catch(java.security.InvalidKeyException ex){
             ex.printStackTrace();
         }
         catch(javax.crypto.BadPaddingException ex){
             ex.printStackTrace();
         }
         catch(javax.crypto.IllegalBlockSizeException ex){
             ex.printStackTrace();
         }
         return cipherByte;
      }
      public static void main(String[] args) throws Exception{
      		P12_01 p12_01 = new P12_01();
      		String msg = "���˻�_��ȫ��̼���";
      		System.out.println("�����ǣ�" + msg);
      		byte[] enc = p12_01.createEncryptor(msg);      		
      		System.out.println("�����ǣ�" + new String(enc));
      		byte[] dec = p12_01.createDecryptor(enc);
      		System.out.println("���ܺ�Ľ���ǣ�" + new String(dec));     
      }
}

