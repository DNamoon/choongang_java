package mini_game;

import java.util.Scanner;

public class RandomNumberGame2 {

	//필드
	int num = (int)((Math.random()*100)+1);
	RockGame coin = new RockGame();
	int k = coin.rockGame();  //이미 객체 생성될때 RockGame클래스의 rockGame() 메서드 실행.
	                          //main() 메서드에 rockGame() 메서드 호출 없는데 왜 실행됐나 순간 이해 못 함.
	void start() {
		//System.out.println("num의 숫자는 " + num + "입니다."); //이거 제가 num 뭔지 알고 싶어서 맞게 되는지 확인하고 싶어서 넣었어요!
		for(int i=0;i<k;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자를 맞춰보세요! >>>");
			int user = scan.nextInt();
			if(user == num) {
				System.out.println("정답입니다! 축하합니다. " + (i+1) + "번만에 맞췄습니다.");
				break;
			} else if(user>num) {  //down 힌트
				System.out.println("Random Number는 입력한 " + user + " 보다 낮은 숫자입니다. ");
			} else if(user<num) {  //up 힌트
				System.out.println("Random Number는 입력한 " + user + " 보다 높은 숫자입니다. ");
			} else {
				if(i==k-1) {
					System.out.println("기회를 다 소진했습니다. 실패하셨습니다!");
					System.out.println("computer의 숫자는 " + num + "입니다.");  //실패시 숫자가 궁금할거 같아서 추가
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
			RandomNumberGame2 game = new RandomNumberGame2();
			game.start();
			//일부러 break; 안 넣었어요. start()메소드 완료 후 "게임을 종료합니다." 문구 출력하려고요.
		case 2:
			System.out.println("게임을 종료합니다.");
			break;
		}
	}


}

