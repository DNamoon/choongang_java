package mini_project;

import java.util.Scanner;

public class RockExam {
	public static void main(String[] args) {
		int com = (int)(Math.random()*3)+1 ;
		
		System.out.println("------------------------------");
		System.out.println("������������ �սô�!");
		System.out.println("1. ����  | 2. ����  | 3. �� ");
		System.out.println("------------------------------");
		System.out.print("�����ϼ���! >>>");
		
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		
		if(com == 1) { //1�� ����, 2�� ����, 3�� ����� ���!
			if(user == 1) {  //��ǻ�� ����, ����� ����
				System.out.println("�����ϴ�. ���� ��ȸ�� 4���Դϴ�.");				
			} else if(user == 2) {  //��ǻ�� ����, ����� ����
				System.out.println("�̰���ϴ�. ���� ��ȸ�� 6���Դϴ�.");
			} else if(user == 3) {  //��ǻ�� ����, ����� ��
				System.out.println("�����ϴ�. ���� ��ȸ�� 2���Դϴ�.");
			}
		} else if (com == 2) {
			if(user == 1) {  //��ǻ�� ����, ����� ����
				System.out.println("�����ϴ�. ���� ��ȸ�� 2���Դϴ�.");				
			} else if(user == 2) {  //��ǻ�� ����, ����� ����
				System.out.println("�����ϴ�. ���� ��ȸ�� 4���Դϴ�.");
			} else if(user == 3) {  //��ǻ�� ����, ����� ��
				System.out.println("�̰���ϴ�. ���� ��ȸ�� 6���Դϴ�.");
			}
		} else if (com ==3) {
			if(user == 1) {  //��ǻ�� ��, ����� ����
				System.out.println("�̰���ϴ�. ���� ��ȸ�� 6���Դϴ�.");				
			} else if(user == 2) {  //��ǻ�� ��, ����� ����
				System.out.println("�����ϴ�. ���� ��ȸ�� 2���Դϴ�.");
			} else if(user == 3) {  //��ǻ�� ��, ����� ��
				System.out.println("�����ϴ�. ���� ��ȸ�� 4���Դϴ�.");
			}
		}
		System.out.println("com�� ���ڴ� " + com + "�Դϴ�.");
		
		if(com == user) {
			System.out.println("�����ϴ�. �����ȸ�� 4���Դϴ�.");
		}
		
		
		
		
		
		
		
	}

}
