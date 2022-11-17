package Fx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDao {
    private Connection conn;
	public PreparedStatement ps =null;
	public ResultSet rs = null;
    
    public Connection connect() throws ClassNotFoundException, SQLException  {
    	conn = DBconn.getConnection();
    	
    	//ps = conn.prepareStatement(sql);
		return conn;
    }
    
    public int input(Emp emp) throws SQLException {
    	//
//    	Scanner scan = new Scanner(System.in);
//    	System.out.println("추가할 사항을 사번(숫자), 이름(한글), 월급순으로 입력하세요>>>");
//    	int emp_id = scan.nextInt();
//    	String emp_name = scan.nextLine();
//    	int emp_salary = scan.nextInt();
    	
    	String sql = "insert into EmpEx1 values (?, ?, ?)";
    	ps = conn.prepareStatement(sql);
    	ps.setInt(1, emp.emp_id);
    	ps.setString(2, emp.emp_name);
    	ps.setInt(3, emp.emp_salary);
    	//rs = ps.executeQuery();
    	//rs.next();
    	int res = ps.executeUpdate();
    	
    	//System.out.printf("%d, %s, %d \n",rs.getInt(1),rs.getString(2),rs.getInt(3));
		return res;
    	
    }
    public int modify(Emp emp) throws SQLException {
    	
    	String sql = "update EmpEx1 set ? where emp_id = ?";
    	ps = conn.prepareStatement(sql);
    	ps.setInt(1, emp.emp_salary);
    	ps.setInt(2, emp.emp_id);
    	
    	//rs = ps.executeQuery();
    	//rs.next();
    	int res = ps.executeUpdate();
		return res;
    	
    }
    public int remove(Emp emp) throws SQLException {
    	//
    	String sql = "delete from EmpEx1  where emp_id = ?";
    	ps = conn.prepareStatement(sql);
    	ps.setInt(1, emp.emp_id);
    	
    
    	//rs = ps.executeQuery();
    	//rs.next();
    	int res = ps.executeUpdate();
		return res;
    	
    }
    public ArrayList<Emp> lists() throws SQLException {
    	//
    	ResultSet rs = null;
    	Statement stat = null;
    	
    	stat = conn.createStatement();
    	rs = stat.executeQuery("select * from empex1 order by emp_id");
    	
    	
    	ArrayList<Emp> emp_list = new ArrayList<Emp>();
    	while(rs.next()) {
    		int emp_id = rs.getInt("emp_id");
    		String emp_name = rs.getString("emp_name");
    		int emp_salary = rs.getInt("emp_salary");
    		
    		emp_list.add(new Emp(emp_id,emp_name,emp_salary));
    		System.out.printf("사번: %d, 이름: %s, 월급: %d \n",emp_id,emp_name,emp_salary);
    	}
    	
		return emp_list;
    	
    }
    
  
    
}
