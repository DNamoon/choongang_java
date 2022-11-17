
public class StudentExam1 {
	public static void main(String[] args) {
		Student.aaa();
		Student.sum2();
		
		//Student.bbb();
		Parent p = new Parent();
		Student st = new Student("È«±æµ¿",90,90,100,p);
		//st.bbb();
		System.out.println(Student.kor+", "+Student.math+", "+Student.eng);
		st.sum();
		
		System.out.println(Student.kor+", "+Student.math+", "+Student.eng);
		Student st2 = new Student("±è»ç¶û",80,90,80,p);
		System.out.println(Student.kor+", "+Student.math+", "+Student.eng);
		st2.bbb();
		st2.sum();
		
		Student.kor = 40;
		int test = st.kor + st2.kor;
		System.out.println(test);
		System.out.println(Student.kor);
	}
}
