import java.util.Scanner;

public class Exercise05_09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		int max1 = 0;
		double sum1 = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수는 몇명입니까? >>>");
				studentNum = scanner.nextInt();
//!				scores = new int [studentNum]; //31줄에 있던걸 계속 에러나서 26줄로 가져왔는데 이거는 왜 되고 31줄에 쓰면 안 되지? 왜 29라인으로 바뀌어 있지?
			} else if(selectNo == 2) {  //scores 배열을 먼저 채워야 하는구나
				for(int i=0;i<studentNum;i++) {  //for문으로 채워야 하나?
					System.out.print( i+1 + "번째 학생의 점수를 입력하세요. >>>"); 
					int score = scanner.nextInt(); //근데 또 입력 받아야하니까
//!					scores = new int [studentNum];  //for문 안에 정의했어도 scores 배열은 지역변수 아니니까 상관없지 않나?  //잉? 계속 새로운 객체 생성하는거잖아? 이게 왜 질문이었지? for문 성격 모르는거 같은데?
					scores[i] = score;  //에러남! 왜냐하면 배열의 크기를 안 지정해주어서! 그래서 위에 코드 추가
					System.out.println(scores[i]);
				}
				//int[] scores = new int[studentNum];
				//for(int i : scores) {
				
			} else if(selectNo == 3) { //에러나는데 왜지? 첫번째, 두번째 값이 안 나오는데
				/*for(int score : scores) {  //일반적인 for문으로 구현해 보자
					System.out.println(score);
				}*/
				for(int i=0; i<studentNum; i++) {
					System.out.println(scores[i]); //반복문 썼잖아? 그러면 scores[0] , scores[1], scores[2]까지 다 나와야지 왜 scores[2]만 나와?
				}
				
			} else if(selectNo == 4) {
				for(int score: scores) {
					if(max1<score) {
						max1 = score;
					}
				}
				for(int score : scores) { //4번을 다시 누르면 sum1이 계속 증가하니까 지역변수로 설정하자. 
					sum1 += score;
				}
				System.out.println("최고 점수: " + max1);
				System.out.println(sum1);
				System.out.println("평균 점수: " + sum1/scores.length);
				
			} else if(selectNo ==5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}

	}

}
