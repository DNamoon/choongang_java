package finalTeamProject;

import java.util.Scanner;
import finalTeamProject.*;

public class RockGame extends ChanceNumber {   //클래스 나누면서 필드 어떻게 하나 했는데 상속으로 해결!
	
	//가위바위보 메서드
	int rockGame() {
		int com = (int)(Math.random()*3)+1 ;
	
		System.out.println("------------------------------");
		System.out.println("가위바위보를 합시다!");
		System.out.println("1. 가위  | 2. 바위  | 3. 보 ");
		System.out.println("------------------------------");
		System.out.print("선택하세요! >>>");
	
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		
		System.out.println();
	
		if(com == 1) { //1을 가위, 2를 바위, 3을 보라고 약속!
			if(user == 1) {  //컴퓨터 가위, 사용자 가위
				tieGame();
			} else if(user == 2) {  //컴퓨터 가위, 사용자 바위
				winGame();
			} else if(user == 3) {  //컴퓨터 가위, 사용자 보
				loseGame(); 
			}
		} else if (com == 2) {
			if(user == 1) {  //컴퓨터 바위, 사용자 가위
				loseGame();	
			} else if(user == 2) {  //컴퓨터 바위, 사용자 바위
				tieGame();	
			} else if(user == 3) {  //컴퓨터 바위, 사용자 보
				winGame();
			}
		} else if (com ==3) {
			if(user == 1) {  //컴퓨터 보, 사용자 가위
				winGame();		
			} else if(user == 2) {  //컴퓨터 보, 사용자 바위
				loseGame(); 
			} else if(user == 3) {  //컴퓨터 보, 사용자 보
				tieGame();	
			}
		}
//	System.out.println("com의 숫자는 " + com + "입니다.");
	return chanceNumber ;  // 이 부분 어떻게 하지?  // 필드하나를 공통으로 지정함으로서 문제해결.
	
	
}
//==========================================================================================================

	/*//필드
	int win = 6;
	int tie = 4;
	int lose = 2;
	int chanceNumber ;
	
	//메서드
	
	//이겼을 경우
	int winGame() {
		System.out.println("이겼습니다. 맞출 기회는 " + win + "번입니다.");
		chanceNumber = win;
		return chanceNumber;
	}
	
	//비긴 경우
	int tieGame() {
		System.out.println("비겼습니다. 맞출 기회는 " + tie + "번입니다.");
		chanceNumber = tie;
		return chanceNumber;
	}
	
	
	//진 경우
	int loseGame() {
		System.out.println("졌습니다. 맞출 기회는 " + lose + "번입니다.");
		chanceNumber = lose;
		return chanceNumber;
	}
*/

}

