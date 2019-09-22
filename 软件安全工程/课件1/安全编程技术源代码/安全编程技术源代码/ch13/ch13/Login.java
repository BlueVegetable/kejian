import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("���������˺�:");
		String account = br.readLine();
		System.out.print("������������:");
		String password = br.readLine();		
		password = MD5.generateCode(password);	//������ת��������		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = 
			DriverManager.getConnection("jdbc:odbc:CustomerDs","","");
		String sql = 
			"SELECT * FROM T_CUSTOMER WHERE ACCOUNT=? AND PASSWORD=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, account);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			System.out.println("��ӭ" + rs.getString("CNAME").trim() + "��¼��");
		}
		else{
			System.out.println("��¼ʧ�ܣ�");
		}
		rs.close();
		ps.close();
		conn.close();		
	}
}
