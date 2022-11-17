package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentExam {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿",22),
				new Student("�ſ��",55),
				new Student("�̼���",34)
				);
		
		Stream<Student> st = studentList.stream();
		st.forEach(name->System.out.println(name.getName()));
		
		
		st = studentList.stream();  //stream�� �ѹ� ����ϸ� �ٽ� stream �����ؼ� 
		st.forEach(age->System.out.println(age.getAge()));

	}

}
