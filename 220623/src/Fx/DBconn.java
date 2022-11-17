package Fx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconn { // connection 하는 클래스인가봐
    private static Connection dbconn=null;
    
    //public 메서드
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
    	//
    	String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
//		PreparedStatement ps =null;
//		ResultSet rs = null;
		
		Class.forName("oracle.jdbc.OracleDriver");
		dbconn = DriverManager.getConnection(url,id,pw);
		
    	
		return dbconn;
    }
    
}
