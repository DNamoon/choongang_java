package pg695;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class TestEx {
	private static List<Student> ls = Arrays.asList(
			new Student("È«±æµ¿", 90,96),
			new Student("È«±æÃ¶",95,93)
			);
	public static void printString(Function<Student, String> function) {
		for(Student student : ls) {
			System.out.println(student.getName()+ " ");
			//System.out.println(function.apply(student)+" ");
			
		}
		System.out.println();
	}
	
	public static void prnInt(ToIntFunction<Student> fnc) {
		int sum = 0;
		
		for(Student stu: ls) {
			System.out.print(fnc.applyAsInt(stu)+" ");
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printString(t->t.getName());
		prnInt(t->t.getEnglishScore());
	}

}
