import java.util.Scanner;

public class ScoreExam {
	public static void main(String[] ar) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��Է�>>");
		String name = sc.nextLine();
		System.out.print("���� ���� �Է�>>");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է�>>");
		int math = sc.nextInt();
		System.out.print("���� ���� �Է�>>");
		int eng = sc.nextInt();
		
		Score score = new Score(name, kor, math, eng);
		System.out.println("����:"+score.sum());
		System.out.println("���:"+score.avg());
		System.out.println("<<<���>>>\n"+score.eval());
	}
}
