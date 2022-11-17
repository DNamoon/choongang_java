package pg783;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test02 {
	public static void prn(Student st) {
		System.out.println(st+ Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		List<Student> ls = Arrays.asList(
				new Student("홍길동",90),
				new Student("홍길철",92) ,
				new Student("홍길순",98));
	//	int sum = 0;
		Stream<Student> st = ls.stream();
		st.forEach(n -> {
	
		});
		
		
//		double dd = ls.stream().mapToInt(Student::getScore).average().getAsDouble();
//		System.out.println(dd);
		
		//병렬처리 
		
//		Stream<Student> st = ls.stream();
		//Stream<Student> st = ls.parallelStream();
		//st.forEach(Test02 :: prn);
		//st.forEach(n->Test02.prn(n));
		//List<String> list111 = Arrays.asList("홍길도","신용권","자바");
		
		
		
//		for(String name: list111) {
//			System.out.println(name);
//		}
//		
//		list111.add("감자");
//		System.out.println();
//		
//		for(String name: list111) {
//			System.out.println(name);
//		}
		
	}
}
