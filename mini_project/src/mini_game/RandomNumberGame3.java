package mini_game;

import java.util.Scanner;

public class RandomNumberGame3 extends MiniGame{

	void randomNumberGame() {
		Out : for(;;) {
			System.out.println();
			System.out.println("랜덤 숫자 맞추기 게임을 시작하시겠습니까? ");
			System.out.println("==========================================");
			System.out.println("1.YES | 2. NO");
			System.out.println("==========================================");
			
			System.out.print("answer >>>");
			Scanner scan = new Scanner(System.in);
			int answer = scan.nextInt();
			
			switch(answer) {
			case 1 : 
				/*RandomNumberGame3 game = new RandomNumberGame3();
				game.start();*/
				start();
				break;	
			case 2:
				System.out.println("랜덤 숫자 맞추기 게임을 종료합니다.");
				System.out.println("메인화면으로 돌아갑니다.");
				System.out.println();
				break Out;
			}
		}
	}
	
	//start 메서드
	int start() {    // scoreOfC 받기위해서 리턴타입 int로 변경. 
		
		System.out.println("난이도 조절을 위해 가위바위보 게임을 진행합니다!");
		System.out.println("이기면 6번의  기회가, 비기면 4번, 지면 2번의 기회가 주어집니다.");
		int num = (int)((Math.random()*100)+1);
		RockGame coin = new RockGame();
		int k = coin.rockGame();  
		
		System.out.println("num의 숫자는 " + num + "입니다."); 
		Out : for(int i=0;i<k;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자를 맞춰보세요! >>>");
			int user = scan.nextInt();
			
			if(i == k-1) {
				System.out.println("기회를 다 소진했습니다. 실패하셨습니다!");
				System.out.println("computer의 숫자는 " + num + "입니다.");
				System.out.println("획득한 점수는 0점입니다.");
				
				scoreOfC += 0;  //점수 누적하기 위해서 += 사용
				
				System.out.println("현재 랜덤 숫자 맞추기 게임에서 획득한 점수는 " + scoreOfC + "점입니다.");
				
				break Out;
			} else {
				if(user == num) {
					System.out.println("정답입니다! 축하합니다. " + (i+1) + "번만에 맞췄습니다.");
					System.out.println("점수를 1점 추가 획득하셨습니다.");
					
					scoreOfC += 1; //점수 누적하기 위해서 += 사용
					
					System.out.println("현재 랜덤 숫자 맞추기 게임에서 획득한 점수는 " + scoreOfC + "점입니다.");
					break Out;
				} else if(user>num) {  //down 힌트
					System.out.println("Random Number는 입력한 " + user + " 보다 낮은 숫자입니다. ");
				} else if(user<num) {  //up 힌트
					System.out.println("Random Number는 입력한 " + user + " 보다 높은 숫자입니다. ");
			}
	
			}
		}
		return scoreOfC;
		
	}
	


}


