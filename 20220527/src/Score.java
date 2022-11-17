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
		System.out.println("총점: " + sum);
		return sum;
		
	}
	
	int sum() {
		
		int sum = skor + sMath + sEng;
		
		return sum;
		
	}
	
	double avg(int skor, int sMath, int sEng) {
		
		double avg = (double) (skor + sMath + sEng)/3;
		System.out.println("평균: " + avg);
		return avg;
	}
	
	void isPass() {
		if(((skor+sMath+sEng)/3) < 60 ) {//| skor<40 | sMath<40 | sEng<40) {
			System.out.println("평균이 60점 미만이라 불합격입니다.");	
		}else if (skor<40 | sMath<40 | sEng<40) {
			System.out.println("한 과목이 40점 미만이라 과락입니다.");
		}else {
			System.out.println("합격입니다.");
		}
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		System.out.print("이름입력>>");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.print("국어 점수 입력>>");
//		int kor = sc.nextInt();
//		System.out.println("수학 점수 입력>>");
//		int math = sc.nextInt();
//		System.out.println("영어 점수 입력>>");
//		int eng = sc.nextInt();
//		
//		Score score = new Score();
//		
//		score.sum(kor, math, eng);
//		score.avg(kor, math, eng);
//	}

}
