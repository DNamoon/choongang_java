import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDataEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// oracle 연동하고 테이블 받아오자.
		
		
		//================= 오라클하고 자바 연결하기==========================
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Statement stat = null;
		ResultSet rs = null;
		int i =0;
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
		//================= 오라클하고 자바 연결하기==========================
		
		stat = conn.createStatement();
		rs = stat.executeQuery("select * from emptest");
		
		List<EmpData> emp = new ArrayList<EmpData>();   //ArrayList 배열 사용하기
		
		while(rs.next()) {
			int emp_id = rs.getInt("emp_id");
			String emp_name = rs.getString("emp_name");
			String emp_email = rs.getString("emp_email");
			int emp_salary = rs.getInt("emp_salary");
			
			emp.add(new EmpData(emp_id, emp_name, emp_email, emp_salary));
			//EmpData a = (new EmpData(emp_id, emp_name, emp_email, emp_salary));
			//System.out.println(a);
			System.out.printf("%d, %s, %s, %d \n", emp_id, emp_name, emp_email, emp_salary);
//			System.out.println(emp.get(i).emp_email);
//			i++;	
	
		
//		for(EmpData a : emp) {
//			System.out.println(a.emp_name);
//		}
		
		
		}

	}
}
