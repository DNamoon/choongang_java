package mini_game;

import java.util.Scanner;

public class RandomNumberGame {
	
	//필드
	int num = (int)(Math.random()*100)+1;
	RockGame coin = new RockGame();
	int k = coin.rockGame();
	
	void start() {
		for(int i=0;i<k;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자를 맞춰보세요! >>>");
			int user = scan.nextInt();
			if(user == num) {
				System.out.println("정답입니다! 축하합니다. " + (i+1) + "번만에 맞췄습니다.");
				break;
			} else {
				if(i==k-1) {
					System.out.println("기회를 다 소진했습니다. 실패하셨습니다!");
					break;
				}
				System.out.println("틀렸습니다. 다시 한번 생각해보세요!");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("게임을 시작하시겠습니까? ");
		System.out.println("==========================================");
		System.out.println("1.YES | 2. NO");
		System.out.println("==========================================");
		
		System.out.print("answer >>>");
		Scanner scan = new Scanner(System.in);
		int answer = scan.nextInt();
		
		switch(answer) {
		case 1 : 
			RandomNumberGame game = new RandomNumberGame();
			game.start();
			//일부러 break; 안 넣었어요. start()메소드 완료 후 "게임을 종료합니다." 문구 출력하려고요.
		case 2:
			System.out.println("게임을 종료합니다.");
			break;
		}
	}


}
