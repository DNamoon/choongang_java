import java.util.Scanner;

public class ScoreExample {

	public static void main(String[] args) {
	
		System.out.print("이름입력>>");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("국어 점수 입력>>");
		int kor = sc.nextInt();
		System.out.println("수학 점수 입력>>");
		int math = sc.nextInt();
		System.out.println("영어 점수 입력>>");
		int eng = sc.nextInt();
		
		Score score = new Score(name, kor, math, eng);
		//Score score = new Score();
		
		score.sum(kor, math, eng);
		score.avg(kor, math, eng);
		score.isPass();
		
		System.out.println("총점: " + score.sum());
		Score s = new Score();
		s.name = "이";
		
	}

}
