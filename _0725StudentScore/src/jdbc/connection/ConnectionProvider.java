package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:apache:commons:dbcp:guestbook"); 
		//뒤에 guestbook 커넥션 풀의 이름이므로 좀 살펴봐야 한다. 오류나면 여기 한번 살펴봐야 할 듯.
		
	}
}








