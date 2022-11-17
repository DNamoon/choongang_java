import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {  //1교시에 한거 .하나하나 jdbc 연동하는거 하나하나 해보라고 하심.
	                 //테이블 불러보기 (ex3_2)
	                 //테이블에 데이터 넣어보기(update) (200, 홍길동)
	                 //prepareStatement  사용하기
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Connection conn = null;
		Statement stat = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		//stat = conn.createStatement();
		
		//int num =300;
		//String name = "나사랑";
		String sql = "insert into ex3_2(emp_id, emp_name) values (?,?)";   //preparedStatement 사용방법
		
		ps = conn.prepareStatement(sql);
		ps.setInt(1,500);
		ps.setString(2, "오사랑");
		//stat = conn.prepareStatement(sql);
		//String sql = String.format("insert into ex3_2(emp_id, emp_name) values(%d, '%s')",num,name);
		int res = ps.executeUpdate();
		//int res = stat.executeUpdate("insert into ex3_11(col1, col2) values ('10',100)");
		System.out.println(res);
		
//		rs = stat.executeQuery("select * from employees");
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//		}
		//rs.close();
		stat.close();
		conn.close();

	}

}
