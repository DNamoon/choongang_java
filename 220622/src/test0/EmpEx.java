package test0;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps =null;
		ResultSet rs2 = null;
		
		EmpDao data = new EmpDao();
		data.connect();
		
//		String sql = ""
//		ps = test.connect().prepareStatement(sql);
		
		//EmpDao data = new EmpDao();
		
		//data.input(new Emp(1,"홍길동",300)).next();
		
		//case1 =============================================
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("추가할 사람의 사번(숫자)을 입력하세요 >>>");
//    	int emp_id = scan.nextInt();
//    	System.out.println("추가할 사람의 이름을 입력하세요 >>>"); 
//    	String emp_name = scan.next();
//    	System.out.println("추가할 사람의 월급을 입력하세요 >>>");
//    	int emp_salary = scan.nextInt();
//    	int res = data.input(new Emp(emp_id,emp_name,emp_salary));
		
    	
//		int res = data.input(new Emp(27,"구씨형555",700));
		
	//	System.out.println(res+"번 입력되었습니다.");
		//========================================================
		
		
		//rs2.next();
		//System.out.printf("%s, %s, %s \n",rs2.getString(1),rs2.getString(2),rs2.getString(3));
		
		
//		rs2 = data.input(new Emp(1,"홍길동",3000));
//		rs2.next();
		//System.out.printf("%d, %s, %d \n",rs.getInt(1),rs2.getString(2),rs2.getInt(3));
		
		
		for(Emp a :data.lists()) {
		//	System.out.println(a.);
		}
		
		
		
		
	}

}
