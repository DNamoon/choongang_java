import java.util.Scanner;

public class Exercise05_09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		int max1 = 0;
		double sum1 = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("------------------------------------------");
			System.out.print("����>>>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л����� ����Դϱ�? >>>");
				studentNum = scanner.nextInt();
//!				scores = new int [studentNum]; //31�ٿ� �ִ��� ��� �������� 26�ٷ� �����Դµ� �̰Ŵ� �� �ǰ� 31�ٿ� ���� �� ����? �� 29�������� �ٲ�� ����?
			} else if(selectNo == 2) {  //scores �迭�� ���� ä���� �ϴ±���
				for(int i=0;i<studentNum;i++) {  //for������ ä���� �ϳ�?
					System.out.print( i+1 + "��° �л��� ������ �Է��ϼ���. >>>"); 
					int score = scanner.nextInt(); //�ٵ� �� �Է� �޾ƾ��ϴϱ�
//!					scores = new int [studentNum];  //for�� �ȿ� �����߾ scores �迭�� �������� �ƴϴϱ� ������� �ʳ�?  //��? ��� ���ο� ��ü �����ϴ°��ݾ�? �̰� �� �����̾���? for�� ���� �𸣴°� ������?
					scores[i] = score;  //������! �ֳ��ϸ� �迭�� ũ�⸦ �� �������־! �׷��� ���� �ڵ� �߰�
					System.out.println(scores[i]);
				}
				//int[] scores = new int[studentNum];
				//for(int i : scores) {
				
			} else if(selectNo == 3) { //�������µ� ����? ù��°, �ι�° ���� �� �����µ�
				/*for(int score : scores) {  //�Ϲ����� for������ ������ ����
					System.out.println(score);
				}*/
				for(int i=0; i<studentNum; i++) {
					System.out.println(scores[i]); //�ݺ��� ���ݾ�? �׷��� scores[0] , scores[1], scores[2]���� �� ���;��� �� scores[2]�� ����?
				}
				
			} else if(selectNo == 4) {
				for(int score: scores) {
					if(max1<score) {
						max1 = score;
					}
				}
				for(int score : scores) { //4���� �ٽ� ������ sum1�� ��� �����ϴϱ� ���������� ��������. 
					sum1 += score;
				}
				System.out.println("�ְ� ����: " + max1);
				System.out.println(sum1);
				System.out.println("��� ����: " + sum1/scores.length);
				
			} else if(selectNo ==5) {
				System.out.println("���α׷� ����");
				run = false;
			}
		}

	}

}
