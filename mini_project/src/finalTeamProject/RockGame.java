package finalTeamProject;

import java.util.Scanner;
import finalTeamProject.*;

public class RockGame extends ChanceNumber {   //Ŭ���� �����鼭 �ʵ� ��� �ϳ� �ߴµ� ������� �ذ�!
	
	//���������� �޼���
	int rockGame() {
		int com = (int)(Math.random()*3)+1 ;
	
		System.out.println("------------------------------");
		System.out.println("������������ �սô�!");
		System.out.println("1. ����  | 2. ����  | 3. �� ");
		System.out.println("------------------------------");
		System.out.print("�����ϼ���! >>>");
	
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		
		System.out.println();
	
		if(com == 1) { //1�� ����, 2�� ����, 3�� ����� ���!
			if(user == 1) {  //��ǻ�� ����, ����� ����
				tieGame();
			} else if(user == 2) {  //��ǻ�� ����, ����� ����
				winGame();
			} else if(user == 3) {  //��ǻ�� ����, ����� ��
				loseGame(); 
			}
		} else if (com == 2) {
			if(user == 1) {  //��ǻ�� ����, ����� ����
				loseGame();	
			} else if(user == 2) {  //��ǻ�� ����, ����� ����
				tieGame();	
			} else if(user == 3) {  //��ǻ�� ����, ����� ��
				winGame();
			}
		} else if (com ==3) {
			if(user == 1) {  //��ǻ�� ��, ����� ����
				winGame();		
			} else if(user == 2) {  //��ǻ�� ��, ����� ����
				loseGame(); 
			} else if(user == 3) {  //��ǻ�� ��, ����� ��
				tieGame();	
			}
		}
//	System.out.println("com�� ���ڴ� " + com + "�Դϴ�.");
	return chanceNumber ;  // �� �κ� ��� ����?  // �ʵ��ϳ��� �������� ���������μ� �����ذ�.
	
	
}
//==========================================================================================================

	/*//�ʵ�
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
*/

}

