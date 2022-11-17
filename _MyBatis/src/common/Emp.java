package common;

public class Emp {
   int employee_id;
   String first_name;
//   String name;
   int salary;
   
   Emp(){}
//   
//   Emp(int employee_id){
//	   this.employee_id = employee_id;
//   }
//   
//   Emp(String first_name){
//	   this.first_name = first_name;
//   }
   
   
//@Override
//public String toString() {
//	// TODO Auto-generated method stub
//	return employee_id+": " + first_name + " / " + salary ;
//}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return first_name+   " / " + salary ;
}
   
   
}
