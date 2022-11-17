import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ojdbc {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		String sql = "select count(*) as num from employees ";
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");  // 이름의 클래스가 존재하냐
			conn = DriverManager.getConnection(url,id,pw);
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()) {
				String col = rs.getString("num");
				System.out.println(col);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
