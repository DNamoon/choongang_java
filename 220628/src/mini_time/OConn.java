package mini_time;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OConn {
	
	private static Connection oConn = null;
	
	public static Connection tryConnection() throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";  //오라클 연결 url
		String id = "c##hr"; //오라클 내 사용자명
		String pw = "hr";    // 오라클 내 사용자(id)의 비밀번호..  그 다음에 드라이버매니저 불러야 한다고 했던거 같은데 
		
		Class.forName("oracle.jdbc.OracleDriver");
		oConn = DriverManager.getConnection(url,id,pw);
		
		return oConn;
	}
}
