package mini_game;

import java.util.Scanner;

public class RandomNumberGame {
	
	//�ʵ�
	int num = (int)(Math.random()*100)+1;
	RockGame coin = new RockGame();
	int k = coin.rockGame();
	
	void start() {
		for(int i=0;i<k;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("���ڸ� ���纸����! >>>");
			int user = scan.nextInt();
			if(user == num) {
				System.out.println("�����Դϴ�! �����մϴ�. " + (i+1) + "������ ������ϴ�.");
				break;
			} else {
				if(i==k-1) {
					System.out.println("��ȸ�� �� �����߽��ϴ�. �����ϼ̽��ϴ�!");
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �ѹ� �����غ�����!");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("������ �����Ͻðڽ��ϱ�? ");
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
			//�Ϻη� break; �� �־����. start()�޼ҵ� �Ϸ� �� "������ �����մϴ�." ���� ����Ϸ����.
		case 2:
			System.out.println("������ �����մϴ�.");
			break;
		}
	}


}
