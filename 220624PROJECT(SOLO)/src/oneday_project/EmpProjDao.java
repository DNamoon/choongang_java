package oneday_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpProjDao {
	public Connection conn ;
	Scanner scan = new Scanner(System.in);
	
	public Connection Connect() throws ClassNotFoundException, SQLException {
		conn = OConn.tryConnection();
		return conn;
	}
	
	public void getTable() throws SQLException {
		ResultSet rs = null ;
		Statement s = null;
		
		s = conn.createStatement();
		rs = s.executeQuery("select * from emp_proj");
		
		while(rs.next()) {
			int idNumber = rs.getInt("id_number");
			String empName = rs.getString("emp_name");
			String email = rs.getString("email");
			String department = rs.getString("department");
			
			System.out.printf("사번: %d | 이름 : %s | 이메일 : %s | 부서 : %s \n", idNumber, empName,email,department);
			
		}
		
		return ;
	}
	
	// select은 어떻게 해야할지 모르겠다.
	public EmpProj getColumn(int idNumber) throws SQLException {
		ResultSet rs = null ;
		PreparedStatement ps = null;
		
		ps = conn.prepareStatement("select * from emp_proj where id_number = ?");
		ps.setInt(1, idNumber);
		rs = ps.executeQuery();
		rs.next();
		String empName = rs.getString("emp_name");
		String email = rs.getString("email");
		String department = rs.getString("department");
//		while(rs.next()) {
//			System.out.println(rs.getString(emp.idNumber));   //입력 받는거 여전히 모르겠는걸. 
//		}
		
		//String result = rs.getString(emp.idNumber);
		return new EmpProj(idNumber,empName,email,department);
		
	}
	
	public int addData(EmpProj emp) throws SQLException {
		PreparedStatement ps = null;
		ps = conn.prepareStatement("insert into emp_proj(?, ?, ?, ?");
		ps.setInt(1, emp.idNumber);
		ps.setString(2, emp.empName);
		ps.setString(3, emp.email);
		ps.setString(4, emp.department);
		int res = ps.executeUpdate();
		return res;
	}
	
	public int changeEmail(EmpProj emp) throws SQLException {
		PreparedStatement ps = null;
		ps = conn.prepareStatement("update emp_proj set email = ? where ?");
		ps.setString(1, emp.email);
		ps.setInt(2, emp.idNumber);
		int res = ps.executeUpdate();
		return res;
	}
	
	public int delData(EmpProj emp) throws SQLException {
		PreparedStatement ps=null;
		ps = conn.prepareStatement("delete from emp_proj where id_number = ?");
		ps.setInt(1, emp.idNumber);
		int res = ps.executeUpdate();
		return res;
	}
	
	
	
	
	
}
