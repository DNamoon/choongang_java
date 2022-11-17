package util;

public class Employees {
	private int employee_id;
	private String first_name;
	private int salary;
	private String email;
	
	public Employees select() {
		Employees emp = new Employees();
		emp.first_name = "test";
		emp.employee_id = 100;
		emp.salary = 1000;
		emp.email = "test@email.com";
		return emp;
	}
	
	public Employees select2() {
		Employees emp = new Employees();
		emp.first_name = "test";
		emp.employee_id = 100;
		emp.salary = 1000;
		emp.email = "test@email.com";
		return emp;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
