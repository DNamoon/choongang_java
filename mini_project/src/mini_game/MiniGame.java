package mini_game;

import java.util.Scanner;

public class MiniGame {
	
	static int scoreOfA;
	static int scoreOfB;
	static int scoreOfC;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("반갑습니다. 플레이어의 이름을 입력해주세요>>>");
		String playerId = scan.nextLine();
		
		Out : for(;;) {
			
		System.out.println("===============================================");
		System.out.println("1.영화 제목 맞추기 | 2.행맨 | 3.랜덤 숫자 맞추기 | 4.게임종료 ");
		System.out.println("===============================================");
		System.out.print("원하는 게임을 선택하세요 >>>");
		int chooseGame = scan.nextInt();
		
			switch(chooseGame) {
			case 1:
			case 2:
			case 3: 
				RandomNumberGame3 gameStart = new RandomNumberGame3();
				gameStart.randomNumberGame();
				break;
			case 4: 
				//System.out.println("점수는 " + scoreOfA + scoreOfB + scoreOfC + "점입니다.");
				System.out.println("게임을 종료합니다. "+playerId+"님의 점수는 "+ scoreOfC + "점입니다.");
				break Out;
			}
		}
		
	}
}
