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
		
		//data.input(new Emp(1,"ȫ�浿",300)).next();
		
		//case1 =============================================
		
		Out : for(;;) {
			System.out.println();
			System.out.println("===============================================");
			System.out.println("1.��� | 2.����  | 3. ���� | 4. ��� �ҷ����� | 5. ����");
			System.out.println("===============================================");
			System.out.println("�����ϼ��� >>>");
			int num = scan.nextInt();
			
			
			switch(num){
			case 1 :
				System.out.println("�߰��� ����� ���(����)�� �Է��ϼ��� >>>");
				int emp_id = scan.nextInt();
				System.out.println("�߰��� ����� �̸��� �Է��ϼ��� >>>"); 
				String emp_name = scan.next();
				System.out.println("�߰��� ����� ������ �Է��ϼ��� >>>");
				int emp_salary = scan.nextInt();
				int res = data.input(new Emp(emp_id,emp_name,emp_salary));
				
//		int res = data.input(new Emp(27,"������555",700));
				
				System.out.println(res+"�� �ԷµǾ����ϴ�.");
				break;
				
			case 2 :
				System.out.println("������ �� �� �ԷµǾ����ϴ�. ������ ����� ����� �Է��ϼ���>>>");
				int updateId = scan.nextInt();
				System.out.println("������ ������ �Է��ϼ��� >>>");
				int updateSalary = scan.nextInt();
				int res2 = data.modify(new Emp(updateId,updateSalary));
				
				System.out.println(res2 + "�� �����Ͽ����ϴ�.");
				break;
			case 3 :
				System.out.println("������ ����� ����� �Է��ϼ��� >>>");
				int removeId = scan.nextInt();
				int res3 = data.remove(new Emp(removeId));
				
				System.out.println(res3 + "�� �����Ͽ����ϴ�.");
				System.out.println();
				break;
			case 4 :
				data.lists();
				break;
				
			case 5 :
				System.out.println("���α׷��� �����մϴ�.");
				break Out;
		}
		
				
	}
		
		//========================================================
		
		
		//rs2.next();
		//System.out.printf("%s, %s, %s \n",rs2.getString(1),rs2.getString(2),rs2.getString(3));
		
		
//		rs2 = data.input(new Emp(1,"ȫ�浿",3000));
//		rs2.next();
		//System.out.printf("%d, %s, %d \n",rs.getInt(1),rs2.getString(2),rs2.getInt(3));
		
	//	int res3 = data.remove(new Emp(emp_id));
		
		
		
		
		
		
		
		for(Emp a :data.lists()) {
		//	System.out.println(a.);
		}
		
		
		
		
	}

}
