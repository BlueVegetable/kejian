import java.rmi.Naming;

public class P10_01_RunServer {
	public static void main(String[] args) throws Exception{
		P10_01_QueryInterface queryInterface = new P10_01_Query();
		//����ע���
		Runtime.getRuntime().exec("rmiregistry");
		//�����������һ��JNDI���ƣ�����ע���
		Naming.rebind("queryInterface",queryInterface);
	}
}
