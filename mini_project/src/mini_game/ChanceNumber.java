package mini_game;

public class ChanceNumber {
	//�ʵ�
	int win = 6;
	int tie = 4;
	int lose = 2;
	int chanceNumber ;
		
	//�޼���
	//�̰��� ���
	int winGame() {
		System.out.println("�̰���ϴ�. ���� ��ȸ�� " + win + "���Դϴ�.");
		chanceNumber = win;
		return chanceNumber;
	}
	
	//��� ���
	int tieGame() {
		System.out.println("�����ϴ�. ���� ��ȸ�� " + tie + "���Դϴ�.");
		chanceNumber = tie;
		return chanceNumber;
	}
		
		
	//�� ���
	int loseGame() {
		System.out.println("�����ϴ�. ���� ��ȸ�� " + lose + "���Դϴ�.");
		chanceNumber = lose;
		return chanceNumber;
	}
}
