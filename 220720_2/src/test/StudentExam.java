package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentExam {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",22),
				new Student("신용권",55),
				new Student("이순신",34)
				);
		
		Stream<Student> st = studentList.stream();
		st.forEach(name->System.out.println(name.getName()));
		
		
		st = studentList.stream();  //stream은 한번 사용하면 다시 stream 지정해서 
		st.forEach(age->System.out.println(age.getAge()));

	}

}
