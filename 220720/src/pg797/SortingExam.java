package pg797;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExam {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",30),
				new Student("신용권",10),
				new Student("유미선",25)
				);
		
		studentList.stream()
		.sorted()
		.forEach(s ->System.out.print(s.getScore() + s.getName() + ", \n"));
		
		
		
		System.out.println();
		System.out.println("===================");
		
		IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
		intStream.sorted().forEach(n->System.out.println(n));
		
		
		String st = "가,나,다";
		
	}

}
