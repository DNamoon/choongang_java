package finalTeamProject;

import java.util.Scanner;
import finalTeamProject.*;

public class MiniGame {
	//��� �ǵ��, ���ھ�� �ۺ����� ����
	public static int scoreOfA;
	public static int scoreOfB;
	public static int scoreOfC;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݰ����ϴ�. �÷��̾��� �̸��� �Է����ּ���>>>");
		String playerId = scan.nextLine();
		
		Out : for(;;) {
			
		System.out.println("===============================================");
		System.out.println("1.��ȭ ���� ������ | 2.���ܾ� ������  | 3.���� ���� ������ | 4.�������� ");
		System.out.println("===============================================");
		System.out.print("���ϴ� ������ �����ϼ��� >>>");
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
				//System.out.println("������ " + scoreOfA + scoreOfB + scoreOfC + "���Դϴ�.");
				System.out.println("������ �����մϴ�. "+playerId+"���� ������ "+ (scoreOfA+scoreOfB + scoreOfC) + "���Դϴ�.");
				break Out;
			}
		}
		
	}
}
