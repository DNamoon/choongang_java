import java.util.Scanner;

public class ScoreExample {

	public static void main(String[] args) {
	
		System.out.print("�̸��Է�>>");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("���� ���� �Է�>>");
		int kor = sc.nextInt();
		System.out.println("���� ���� �Է�>>");
		int math = sc.nextInt();
		System.out.println("���� ���� �Է�>>");
		int eng = sc.nextInt();
		
		Score score = new Score(name, kor, math, eng);
		//Score score = new Score();
		
		score.sum(kor, math, eng);
		score.avg(kor, math, eng);
		score.isPass();
		
		System.out.println("����: " + score.sum());
		Score s = new Score();
		s.name = "��";
		
	}

}
