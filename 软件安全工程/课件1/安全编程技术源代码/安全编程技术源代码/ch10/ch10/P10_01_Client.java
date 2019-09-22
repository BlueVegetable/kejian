import java.rmi.Naming;

public class P10_01_Client {
	public static void main(String[] args) throws Exception{
		P10_01_QueryInterface queryInterface = 
			      (P10_01_QueryInterface)Naming.lookup("rmi://127.0.0.1/queryInterface");
			    String result = queryInterface.query();
			   System.out.println(result);
	}
}
