import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class P10_01_Query extends UnicastRemoteObject implements
		P10_01_QueryInterface {
	public P10_01_Query() throws RemoteException {}
	public String query() throws RemoteException {
		//��ѯ���ݿ����
		return "��ѯ���";
	}
}
