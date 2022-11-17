import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;  //sql문을 실행한 결과를 반환하는 데이터 타입이 ResultSet
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		
		//String sql = "select first_name || ' '|| last_name as Name, employees_id, hire_date"
				
		

	}

}
