package mini_game;

import java.util.Scanner;

public class RandomNumberGame3 extends MiniGame{

	void randomNumberGame() {
		Out : for(;;) {
			System.out.println();
			System.out.println("���� ���� ���߱� ������ �����Ͻðڽ��ϱ�? ");
			System.out.println("==========================================");
			System.out.println("1.YES | 2. NO");
			System.out.println("==========================================");
			
			System.out.print("answer >>>");
			Scanner scan = new Scanner(System.in);
			int answer = scan.nextInt();
			
			switch(answer) {
			case 1 : 
				/*RandomNumberGame3 game = new RandomNumberGame3();
				game.start();*/
				start();
				break;	
			case 2:
				System.out.println("���� ���� ���߱� ������ �����մϴ�.");
				System.out.println("����ȭ������ ���ư��ϴ�.");
				System.out.println();
				break Out;
			}
		}
	}
	
	//start �޼���
	int start() {    // scoreOfC �ޱ����ؼ� ����Ÿ�� int�� ����. 
		
		System.out.println("���̵� ������ ���� ���������� ������ �����մϴ�!");
		System.out.println("�̱�� 6����  ��ȸ��, ���� 4��, ���� 2���� ��ȸ�� �־����ϴ�.");
		int num = (int)((Math.random()*100)+1);
		RockGame coin = new RockGame();
		int k = coin.rockGame();  
		
		System.out.println("num�� ���ڴ� " + num + "�Դϴ�."); 
		Out : for(int i=0;i<k;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("���ڸ� ���纸����! >>>");
			int user = scan.nextInt();
			
			if(i == k-1) {
				System.out.println("��ȸ�� �� �����߽��ϴ�. �����ϼ̽��ϴ�!");
				System.out.println("computer�� ���ڴ� " + num + "�Դϴ�.");
				System.out.println("ȹ���� ������ 0���Դϴ�.");
				
				scoreOfC += 0;  //���� �����ϱ� ���ؼ� += ���
				
				System.out.println("���� ���� ���� ���߱� ���ӿ��� ȹ���� ������ " + scoreOfC + "���Դϴ�.");
				
				break Out;
			} else {
				if(user == num) {
					System.out.println("�����Դϴ�! �����մϴ�. " + (i+1) + "������ ������ϴ�.");
					System.out.println("������ 1�� �߰� ȹ���ϼ̽��ϴ�.");
					
					scoreOfC += 1; //���� �����ϱ� ���ؼ� += ���
					
					System.out.println("���� ���� ���� ���߱� ���ӿ��� ȹ���� ������ " + scoreOfC + "���Դϴ�.");
					break Out;
				} else if(user>num) {  //down ��Ʈ
					System.out.println("Random Number�� �Է��� " + user + " ���� ���� �����Դϴ�. ");
				} else if(user<num) {  //up ��Ʈ
					System.out.println("Random Number�� �Է��� " + user + " ���� ���� �����Դϴ�. ");
			}
	
			}
		}
		return scoreOfC;
		
	}
	


}


