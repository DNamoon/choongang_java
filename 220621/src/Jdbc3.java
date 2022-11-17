import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//입력받은거 검색해보기
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;  //sql문을 실행한 결과를 반환하는 데이터 타입이 ResultSet
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색 시작날짜 입력 (예)200407>");
		int num1 = scan.nextInt();
		System.out.println("검색 끝날짜 입력 (예) 200407>");
		int num2 = scan.nextInt();
		System.out.println(num1+" ~ "+ num2);
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		String sql = "select last_name, hire_date from employees "
				+ "where hire_date between to_date(?,'yyyymm') and to_date(?,'yyyymm')"
				+ "order by hire_date";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, num1);
		ps.setInt(2,num2);
		rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("last_name"));
			System.out.printf("%s, %s \n",rs.getString(1),rs.getString(2));
		}
		System.out.println();
		
//		ps.setString(1, "C%");
//		rs = ps.executeQuery();
//		while(rs.next()) {
//			System.out.println(rs.getString("last_name"));
//		}
		
		
		rs.close();
		ps.close();
		conn.close();
		
	}

}
