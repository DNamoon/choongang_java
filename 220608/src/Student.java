
public class Student {
	String name;
	static int Student;
	static int kor;
	static int math;
	static int eng;
	Parent p;
	
	Student(){
	}
	
	Student(String name, int kor, int math, int eng){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	Student(String name, int kor, int math, int eng, Parent p){
		this(name,kor,math,eng);
		this.p = p;
	}
	
	public static void aaa() {
	}
	public void bbb() {}
	
	public void sum() {
		System.out.println("รัมก: " + (kor+math+eng));
	}
	
	public static void sum2() {
		System.out.println("รัมก: " +(kor+math+eng));
	}

}
