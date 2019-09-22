import java.rmi.Naming;

public class P10_01_RunServer {
	public static void main(String[] args) throws Exception{
		P10_01_QueryInterface queryInterface = new P10_01_Query();
		//启动注册表
		Runtime.getRuntime().exec("rmiregistry");
		//将这个对象起一个JNDI名称，放入注册表
		Naming.rebind("queryInterface",queryInterface);
	}
}
