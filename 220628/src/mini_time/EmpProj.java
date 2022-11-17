package mini_time;

public class EmpProj {   //생성자들 만들곳
	int idNumber ;
	String empName ;
	String email;
	String department;
	
	EmpProj(){};
	
	EmpProj(int idNumber){
		this();
	}
	
	EmpProj(int idNumber, String empName, String email, String department){
		this.idNumber = idNumber;
		this.empName = empName;
		this.email = email;
		this.department = department;
	}
	
}
