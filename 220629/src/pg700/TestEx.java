package pg700;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestEx {
	static List<Student> ls = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("홍길순", "여자", 90),
			new Student("강길동", "남자", 95),
			new Student("홍길자", "여자", 92)
			);
	
	public static double avg(Predicate<Student> pred) {
		int co = 0, sum =0;
		for (Student stu : ls) {
			if(pred.test(stu)) {
				co++;
				sum += stu.getScore();
			}
		}
		return (double) sum/co;
	}
	public static void main(String[] args) {
		double dd = avg(t->t.getSex().equals("남자"));
	}
}
