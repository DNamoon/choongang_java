package mini_game;

import java.util.Scanner;

public class MiniGame {
	
	static int scoreOfA;
	static int scoreOfB;
	static int scoreOfC;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݰ����ϴ�. �÷��̾��� �̸��� �Է����ּ���>>>");
		String playerId = scan.nextLine();
		
		Out : for(;;) {
			
		System.out.println("===============================================");
		System.out.println("1.��ȭ ���� ���߱� | 2.��� | 3.���� ���� ���߱� | 4.�������� ");
		System.out.println("===============================================");
		System.out.print("���ϴ� ������ �����ϼ��� >>>");
		int chooseGame = scan.nextInt();
		
			switch(chooseGame) {
			case 1:
			case 2:
			case 3: 
				RandomNumberGame3 gameStart = new RandomNumberGame3();
				gameStart.randomNumberGame();
				break;
			case 4: 
				//System.out.println("������ " + scoreOfA + scoreOfB + scoreOfC + "���Դϴ�.");
				System.out.println("������ �����մϴ�. "+playerId+"���� ������ "+ scoreOfC + "���Դϴ�.");
				break Out;
			}
		}
		
	}
}
