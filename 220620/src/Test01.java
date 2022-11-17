import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// JDBC 하는건가?
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Statement stat = null;
		ResultSet rs = null;
		
//		Class.forName("oracle.jdbc.OracleDriver");
//		conn = DriverManager.getConnection(url, id, pw);
//		stat = conn.createStatement();
//		rs = stat.executeQuery("select * from employees");
//		while(rs.next()) {
//			String ss1 = rs.getString("last_name");
//			String ss2 = rs.getString("salary");
//			System.out.printf("%s, %s\n", ss1,ss2);
////			System.out.println(ss1);
////			System.out.println(ss2);
//			
//		}
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
		stat = conn.createStatement();
//		rs = stat.executeQuery("select first_name |' '| last_name as 'Name', "
//				+ "job_id as 'job', salary as 'Salary' "
//				+ "12*salary+100 as 'Increased_Ann_saloary', 12*(salary+100) as 'Increased_Salary'from employees");
//		rs = stat.executeQuery("select first_name||' '||last_name as Name, job_id as Job, "
//				+ "salary as Salary, 12*salary+100 as Increased_Ann_salary, 12*(salary+100) as Increased_Salary from employees");
		//rs = stat.executeQuery("select to_char (hire_date, 'YYYY\"년\" MM\"월\" DD\"일\" from employees');
		//rrs = stat.executeQuery(("select hire_date from employees");
		//rrs = stat.executeQuery(("select hire_date from employees");
		while(rs.next()) {
//			String ss1 = rs.getString(1);
//			String ss2 = rs.getString("Job");
//			String ss3 = rs.getString("Salary");
//			String ss4 = rs.getString("Increased_Ann_salary");
//			String ss5 = rs.getString("Increased_Salary");
			String ss6 = rs.getString(1);
			String ss1 = rs.getString(2);
			String ss2 = rs.getString(3);
//			
//			System.out.printf("%s: %s, %s, %s, %s \n",ss1,ss2,ss3,ss4,ss5);
			System.out.printf("%s" , ss6);
			//System.out.printf("%s %s, %s, %s, %s, %s", ss1,ss2,ss3,ss4);

			
		}
		
		
		
		rs.close();
		stat.close();
		conn.close();
		
		
		
	
	}

}
