package finalTeamProject0;
//���ܾ������ �޼ҵ�(hang)�� ��������ϴ�. + ���ӽ��� �ȳ���(hangstart)�� �߰��߽��ϴ�.
import java.util.Scanner;

import finalTeamProject0.*;


public class HangGame extends MiniGame {
	
	public void hangstart(){
		Out : for(;;) {
			System.out.println();
			System.out.println("���ܾ� ������ ������ �����Ͻðڽ��ϱ�? ");
			System.out.println("==========================================");
			System.out.println("1.YES | 2. NO");
			System.out.println("==========================================");
		
			System.out.print("answer >>");
			Scanner scan = new Scanner(System.in);
			int answer = scan.nextInt();
		
			switch(answer) {
				case 1 : 
					RockGameHang rgh = new RockGameHang();
					int num = rgh.rockGame();
					HangGame game2 = new HangGame();
					game2.hang(num);
					break;	
				case 2:
					System.out.println("���ܾ� ������ ������ �����մϴ�.");
					System.out.println("����ȭ������ ���ư��ϴ�.");
					System.out.println();
					break Out;
			}
		}
	}
	
				//�Ű����� a�� ���ĺ� ���� �� �ִ� Ƚ��
	public int hang(int a) {
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("<���ܾ� ������ ����>�� �����մϴ�");
		System.out.println("------------------------");

		Scanner scan = new Scanner(System.in);

		List ll = new List();
		String qq = ll.question(ll.pickWord.length());

	
		System.out.println("���ڼ� ["+ll.pickWord.length()+"]���� �ܾ��Դϴ�.");
		System.out.println();


		for(int i=a;i>0;i--) {
			System.out.println(i+"���� ��ȸ�� ���ҽ��ϴ�.");
			System.out.print("���ĺ��� �Է��ϼ���>> ");
			String alphabet = scan.nextLine();
		
			if(alphabet.equals("")) {
				System.out.println("���� �Է��ϼ���.");
				System.out.println();		
			
			}else if(ll.pickWord.contains(alphabet)) {
				System.out.println(alphabet + "��(��) �����ϰ� �ֽ��ϴ�.");
			
				//���ǹ��ڿ�+�ش��ε����� ���ĺ�+���� ���ڿ� : �ش� ��ġ�� ?�� �Է¹��� ���ĺ����� �ٲ۴�
				qq = qq.substring(0,ll.pickWord.indexOf(alphabet))+
						alphabet+
						qq.substring(ll.pickWord.indexOf(alphabet)+1);
				System.out.println();

			} else {
				System.out.println(alphabet + "��(��) �������� �ʽ��ϴ�.");
				System.out.println();
			}

			System.out.println(qq);
		}

		System.out.println("------------------------");
	
		AAA: for (;;) {
			for (int j=3;j>0;j--) {
				System.out.println(j+"���� ��ȸ�� ���ҽ��ϴ�.");
				System.out.print("[����]�� �Է��ϼ���>> ");
				String word = scan.nextLine();
					if (word.equals(ll.pickWord)) {
						System.out.println("�����Դϴ�");
						System.out.println();
						System.out.println("!�¸��߽��ϴ�!");
						System.out.println("ȹ���� ������ 1�� �Դϴ�.");
						scoreOfB += 1;
						break AAA;
					} else if(word.equals("")) {
						System.out.println("���� �Է��ϼ���");
						System.out.println();
					} else { 
						System.out.println("Ʋ�Ƚ��ϴ�");
						System.out.println();
						
					} 
				}

			System.out.println("~�й��߽��ϴ�~");
			System.out.println("ȹ���� ������ 0�� �Դϴ�.");
			scoreOfB += 0;
			break;

		}
		return scoreOfB;
	} 
}