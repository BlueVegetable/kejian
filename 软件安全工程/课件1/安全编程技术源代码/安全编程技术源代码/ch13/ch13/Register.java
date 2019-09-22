import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Register {
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("ÇëÄúÊäÈëÕËºÅ:");
		String account = br.readLine();
		System.out.print("ÇëÄúÊäÈëÃÜÂë:");
		String password = br.readLine();
		System.out.print("ÇëÄúÊäÈëĞÕÃû:");
		String cname = br.readLine();		
		password = MD5.generateCode(password);	//½«ÃÜÂë×ª»»³ÉÃÜÎÄ		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = 
			DriverManager.getConnection("jdbc:odbc:CustomerDs","","");
		String sql = "INSERT INTO T_CUSTOMER VALUES(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, account);
		ps.setString(2, password);
		ps.setString(3, cname);
		ps.execute();		
		ps.close();
		conn.close();		
	}
}
