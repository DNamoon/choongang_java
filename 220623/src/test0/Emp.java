package test0;

public class Emp {
	int emp_id ;
	public String emp_name;
	public int emp_salary;
	
	public Emp(int emp_id, String emp_name, int emp_salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}
	
	Emp(int emp_id){
		this.emp_id = emp_id;
	}
	
	Emp(int emp_id, int emp_salary){
		this.emp_id = emp_id;
		this.emp_salary = emp_salary;
	}
}
