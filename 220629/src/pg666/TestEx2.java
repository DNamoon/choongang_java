package pg666;

import java.util.Arrays;

public class TestEx2 {  //p.667 와일드카드 타입 매개 변수
	
	public static void regCo(Course<? super Worker> co) {
		System.out.println(co.getName() + " 수강생:" + Arrays.toString(co.getStudents()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course<Person> pco = new Course<Person> ("일반인과정", 5);
		pco.add(new Person("일반인"));
		Course<Worker> pco2 = new Course<Worker> ("직장인과정",5);
		pco.add(new Worker("직장인"));
		Course<Student> pco3 = new Course<Student> ("학생과정",5);
		pco.add(new Student("학생"));
		pco.add(new HighStudent("고등학생"));
		
		regCo(pco);
		
		//Course<Worker> wc = new
	}

}
