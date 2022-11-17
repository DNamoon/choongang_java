package finalTeamProject;

import java.util.Scanner;
import finalTeamProject.*;

public class MiniGame {
	//행맨 피드백, 스코어는 퍼블릭으로 변경
	public static int scoreOfA;
	public static int scoreOfB;
	public static int scoreOfC;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("반갑습니다. 플레이어의 이름을 입력해주세요>>>");
		String playerId = scan.nextLine();
		
		Out : for(;;) {
			
		System.out.println("===============================================");
		System.out.println("1.영화 제목 맞히기 | 2.영단어 맞히기  | 3.랜덤 숫자 맞히기 | 4.게임종료 ");
		System.out.println("===============================================");
		System.out.print("원하는 게임을 선택하세요 >>>");
		int chooseGame = scan.nextInt();
		
			switch(chooseGame) {
			case 1:
				MovieGame gameStato = new MovieGame();
				gameStato.movieStart();
				break;
			case 2:
				HangGame hg = new HangGame();
				hg.hangstart();
				break;
			case 3: 
				RandomNumberGame3 gameStart = new RandomNumberGame3();
				gameStart.randomNumberGame();
				break;
			case 4: 
				//System.out.println("점수는 " + scoreOfA + scoreOfB + scoreOfC + "점입니다.");
				System.out.println("게임을 종료합니다. "+playerId+"님의 점수는 "+ (scoreOfA+scoreOfB + scoreOfC) + "점입니다.");
				break Out;
			}
		}
		
	}
}
