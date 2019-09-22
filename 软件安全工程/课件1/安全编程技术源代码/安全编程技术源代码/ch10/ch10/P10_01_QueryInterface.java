import java.rmi.Remote;
import java.rmi.RemoteException;

public interface P10_01_QueryInterface extends Remote{
	public String query() throws RemoteException;
}
