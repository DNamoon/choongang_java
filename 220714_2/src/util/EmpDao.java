package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDao {
    private Connection conn;
    public Connection connect() throws ClassNotFoundException, SQLException {
    	conn = DBconn.getConnection();
		return conn;
    }
    
    public Employees getEmployees(int id) throws SQLException {
    	ResultSet rs = null;
    	PreparedStatement ps = null;
    	ps = conn.prepareStatement("select employee_id, first_name, email, salary from employees where "
    			+ "employee_id = ?");
    	ps.setInt(1, id);
    	rs = ps.executeQuery();
    	Employees emp = new Employees();
    	if(rs.next()) {
    		emp.setEmployee_id(rs.getInt("employee_id"));
    		emp.setFirst_name(rs.getString("first_name"));
    		emp.setEmail(rs.getString("email"));
    		emp.setSalary(rs.getInt("salary"));
    	}
    	return emp;
    	
    }
    
    
    public int input(Emp emp) throws SQLException {
    	//
		return 0;
    	
    }
    public int modify(Emp emp) throws SQLException {
    	//
		return 0;
    	
    }
    public int remove(Emp emp) throws SQLException {
    	//
		return 0;
    	
    }
    public ArrayList<Emp> lists() throws SQLException {
    	//
		return null;
    	
    }
}
