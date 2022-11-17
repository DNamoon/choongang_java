package common;

import java.util.List;

public class TestEx1 {

	public static void main(String[] args) {
		MyBatisService ms = new MyBatisService();
		
//		for(Emp ee : ms.selectList()) {
//			System.out.println(ee);
//			System.out.println("=======");
//			System.out.println(ee.toString());
//		}
			
		//List<Emp> e = ms.findName();
		
		//Emp e = ms.findName(new Emp(300));
		Emp e = ms.findName(200);  //Emp e = new Emp(200);
		//System.out.println("사원번호(" + e.employee_id+") "+e.first_name + ": " + e.salary);
		//System.out.println(e.first_name + ": " +e.salary);
		System.out.println(e);
		//System.out.println(e);
		
//		int n = ms.insertEx3_2();
//		System.out.println(n+"건 입력!");

//		String dd = ms.selectName(400);
//		System.out.println(dd);
		
//		int userId = ms.selectId("홍길철");
//		System.out.println(userId);
//		
//		int userId2 = ms.selectId("홍길동");
//		System.out.println(userId2);
		
		//int n = ms.insertEx32(new Emp())
//		Emp emp = new Emp();
//		emp.employee_id= 800;
//		emp.first_name="이순신";
//		int nn = ms.insertEx32(emp);
//		System.out.println(nn);
//		
//		
	}

}
