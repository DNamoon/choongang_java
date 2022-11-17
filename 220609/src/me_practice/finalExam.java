package me_practice;

public class finalExam {
	public static void main(String[] args) {
		Test01_final p1 = new Test01_final("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "324324-3243242";
		p1.name = "을지문덕";
		System.out.println(p1.name);
	}

}
