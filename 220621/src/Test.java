import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test {
	//id, name, salary

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Statement stat = null;
		ResultSet rs = null;
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
		stat = conn.createStatement();
		
		
		List<Employees> list = new ArrayList<Employees>();
		
		rs = stat.executeQuery("select * from ex3_10");
		
		while(rs.next()) {
			int employeeId = rs.getInt("col1");
			String employeeName = rs.getString("col2");
			int salary = rs.getInt("col3");
			list.add(new Employees(employeeId, employeeName, salary));
			System.out.println(list);
			//System.out.printf("%d, %s - %d \n", employeeId,employeeName,salary);
			
		}
		//for(Employees a : list) {
			//System.out.println(a);
		//}

	}

}
