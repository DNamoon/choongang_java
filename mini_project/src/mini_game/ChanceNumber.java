package mini_game;

public class ChanceNumber {
	//필드
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
}
