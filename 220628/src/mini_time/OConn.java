package mini_time;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OConn {
	
	private static Connection oConn = null;
	
	public static Connection tryConnection() throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";  //����Ŭ ���� url
		String id = "c##hr"; //����Ŭ �� ����ڸ�
		String pw = "hr";    // ����Ŭ �� �����(id)�� ��й�ȣ..  �� ������ ����̹��Ŵ��� �ҷ��� �Ѵٰ� �ߴ��� ������ 
		
		Class.forName("oracle.jdbc.OracleDriver");
		oConn = DriverManager.getConnection(url,id,pw);
		
		return oConn;
	}
}
