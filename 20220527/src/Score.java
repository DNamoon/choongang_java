import java.util.Scanner;

public class Score {
	
	String name;
	int skor;
	int sMath;
	int sEng;
	
	Score(){
	}
	
	Score(String n, int k, int m, int e){
		this.name = n;
		this.skor = k;
		this.sMath = m;
		this.sEng = e;
	}

	
	int sum(int skor, int sMath, int sEng) {
		
		int sum = skor + sMath + sEng;
		System.out.println("����: " + sum);
		return sum;
		
	}
	
	int sum() {
		
		int sum = skor + sMath + sEng;
		
		return sum;
		
	}
	
	double avg(int skor, int sMath, int sEng) {
		
		double avg = (double) (skor + sMath + sEng)/3;
		System.out.println("���: " + avg);
		return avg;
	}
	
	void isPass() {
		if(((skor+sMath+sEng)/3) < 60 ) {//| skor<40 | sMath<40 | sEng<40) {
			System.out.println("����� 60�� �̸��̶� ���հ��Դϴ�.");	
		}else if (skor<40 | sMath<40 | sEng<40) {
			System.out.println("�� ������ 40�� �̸��̶� �����Դϴ�.");
		}else {
			System.out.println("�հ��Դϴ�.");
		}
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		System.out.print("�̸��Է�>>");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.print("���� ���� �Է�>>");
//		int kor = sc.nextInt();
//		System.out.println("���� ���� �Է�>>");
//		int math = sc.nextInt();
//		System.out.println("���� ���� �Է�>>");
//		int eng = sc.nextInt();
//		
//		Score score = new Score();
//		
//		score.sum(kor, math, eng);
//		score.avg(kor, math, eng);
//	}

}
