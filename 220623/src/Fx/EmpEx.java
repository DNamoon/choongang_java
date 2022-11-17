package Fx;

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
		Scanner scan = 	new Scanner(System.in);
		
		EmpDao data = new EmpDao();
		data.connect();
		
		
//		String sql = ""
//		ps = test.connect().prepareStatement(sql);
		
		//EmpDao data = new EmpDao();
		
		//data.input(new Emp(1,"홍길동",300)).next();
		
		//case1 =============================================
		
		Out : for(;;) {
			System.out.println();
			System.out.println("===============================================");
			System.out.println("1.등록 | 2.수정  | 3. 제거 | 4. 목록 불러오기 | 5. 종료");
			System.out.println("===============================================");
			System.out.println("선택하세요 >>>");
			int num = scan.nextInt();
			
			
			switch(num){
			case 1 :
				System.out.println("추가할 사람의 사번(숫자)을 입력하세요 >>>");
				int emp_id = scan.nextInt();
				System.out.println("추가할 사람의 이름을 입력하세요 >>>"); 
				String emp_name = scan.next();
				System.out.println("추가할 사람의 월급을 입력하세요 >>>");
				int emp_salary = scan.nextInt();
				int res = data.input(new Emp(emp_id,emp_name,emp_salary));
				
//		int res = data.input(new Emp(27,"구씨형555",700));
				
				System.out.println(res+"번 입력되었습니다.");
				break;
				
			case 2 :
				System.out.println("월급이 잘 못 입력되었습니다. 수정할 사람의 사번을 입력하세요>>>");
				int updateId = scan.nextInt();
				System.out.println("수정할 월급을 입력하세요 >>>");
				int updateSalary = scan.nextInt();
				int res2 = data.modify(new Emp(updateId,updateSalary));
				
				System.out.println(res2 + "번 수정하였습니다.");
				break;
			case 3 :
				System.out.println("삭제할 사람의 사번을 입력하세요 >>>");
				int removeId = scan.nextInt();
				int res3 = data.remove(new Emp(removeId));
				
				System.out.println(res3 + "번 수정하였습니다.");
				System.out.println();
				break;
			case 4 :
				data.lists();
				break;
				
			case 5 :
				System.out.println("프로그램을 종료합니다.");
				break Out;
		}
		
				
	}
		
		//========================================================
		
		
		//rs2.next();
		//System.out.printf("%s, %s, %s \n",rs2.getString(1),rs2.getString(2),rs2.getString(3));
		
		
//		rs2 = data.input(new Emp(1,"홍길동",3000));
//		rs2.next();
		//System.out.printf("%d, %s, %d \n",rs.getInt(1),rs2.getString(2),rs2.getInt(3));
		
	//	int res3 = data.remove(new Emp(emp_id));
		
		
		
		
		
		
		
		for(Emp a :data.lists()) {
		//	System.out.println(a.);
		}
		
		
		
		
	}

}
