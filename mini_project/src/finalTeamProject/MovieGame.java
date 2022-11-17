package finalTeamProject;

import finalTeamProject.*;
import java.util.Random;
import java.util.Scanner;

public class MovieGame extends MiniGame {

	String name;
//	public static boolean finish = false;  //����
	static Scanner sc = new Scanner(System.in);

	public void MovieGame() {

		System.out.println("---------------------------");
		System.out.println("��ȭ ���� ������ ����");
		System.out.println("---------------------------");
		System.out.println("�ڽ��ִ� �帣�� ������ �ּ���.");
		System.out.println("---------------------------");
		System.out.println("1. ȣ�� ��ȭ | 2. �׼� ��ȭ | 3. �ִϸ��̼�");
		System.out.println("---------------------------");
		System.out.print("����>>");

		int choice = sc.nextInt();
		sc.nextLine();

		System.out.println();
		System.out.println(choice + "���� �����ϼ̽��ϴ�.");

		if (choice == 1) {

			MovieGame m1 = new MovieGame();
			System.out.println("'ȣ�� ��ȭ' �����մϴ�.");
			System.out.println();
			m1.showMov1();
			System.out.println();
			System.out.println();

//			while (!MovieGame.finish) {
//
//				// ����
//				m1.showMov1();
//
//				// ���� �� �ϱ�
//				m1.more();
//				System.out.println();
//				System.out.println();
//			}

		} else if (choice == 2) {
			MovieGame m2 = new MovieGame();
			System.out.println();
			System.out.println("'�׼� ��ȭ' �����մϴ�.");
			System.out.println();
			m2.showMov2();
			System.out.println();

//			while (!MovieGame.finish) {
//				// ����
//				m2.showMov2();
//				// ���� �� �ϱ�
//				m2.more();
//				System.out.println();
//			}

		} else if (choice == 3) {
			MovieGame m3 = new MovieGame();
			System.out.println();
			System.out.println("'�ִϸ��̼�' �����մϴ�.");
			System.out.println();
			m3.showMov3();
			System.out.println();

//			while (!MovieGame.finish) {
//				// ����
//				m3.showMov3();
//				// ���� �� �ϱ�
//				m3.more();
//				System.out.println();
//			}
		}

	}

	public void movieStart() {
		Out: for (;;) {
			System.out.println();
			System.out.println("��ȭ ���� ������ ������ �����Ͻðڽ��ϱ�? ");
			System.out.println("==========================================");
			System.out.println("1.YES | 2. NO");
			System.out.println("==========================================");

			System.out.print("answer >>>");
			Scanner scan = new Scanner(System.in);
			int answer = scan.nextInt();

			switch (answer) {
			case 1:
				MovieGame game1 = new MovieGame();
				game1.MovieGame();
				break;
			case 2:
				System.out.println("��ȭ ���� ������ ������ �����մϴ�.");
				System.out.println("����ȭ������ ���ư��ϴ�.");
				System.out.println();
				break Out;
			}
		}

	}

	public void showMov1() {

		boolean isCorrect = false;
		int cnt = 0;
		int cnt2 = 0;

		// ���������� ����
		System.out.println("���̵� ������ ���� ���������� ������ �����մϴ�!");
		System.out.println("�̱�� 6����  ��ȸ��, ���� 4��, ���� 2���� ��ȸ�� �־����ϴ�.");
		RockGame newStart = new RockGame();
		cnt2 = newStart.rockGame();

		// ����
		String[] questions = { "���� �ʼ��� �´� ������ȭ��?", "���� �ʼ��� �´� �׼ǿ�ȭ��?", "���� �ʼ��� �´� �ִϸ��̼���?" };

		// ���� : "����", "�ֿ�", "���Ϸ�Ʈ ��", "������Ʈ �̺�", "������", "������", "���̾�"
		String[] horror = { "'����'"+"\n"+"(hint: 1976����, �ܱ���ȭ, ���̾�)",  //��Ʈ �߰�
				"'����'"+"\n"+"(hint: 2015����, �ܱ���ȭ, ��ÿ�)", 
				"'�������� ��'"+"\n"+"(hint: 2006����, �ܱ���ȭ, ���̷�)", 
				"'�������� ����'"+"\n"+"(hint: 2002����~, �ܱ���ȭ, ����)", 
				"'������'"+"\n"+"(hint: 2013����~, �ܱ���ȭ, ���ҽ���)", 
				"'������'"+"\n"+"(hint: 2017, ������ȭ, ����)", 
				"'������'" +"\n"+"(hint: 2007����~, �ܱ���ȭ, 1��Ī ����ȭ)"};
		

		Random rand2 = new Random();

		System.out.println("------------------------------------------------");
		System.out.println(questions[0]);
		System.out.println(horror[rand2.nextInt(7)]);
		System.out.println();

		// ȣ����ȭ
		while (true) {
			System.out.print("���� �Է�>>");
			String title = this.sc.nextLine();

			cnt += 1;
			cnt2 -= 1;

			switch (title) {

			case "����":
				if (title.equals(horror[0]))
					System.out.println("���� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "�ֿ�":
				if (title.equals(horror[1]))
					System.out.println("�ֿ� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "���Ϸ�Ʈ ��":
				if (title.equals(horror[2]))
					System.out.println("���Ϸ�Ʈ �� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "������Ʈ �̺�":
				if (title.equals(horror[3]))
					System.out.println("������Ʈ �̺� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "������":
				if (title.equals(horror[4]))
					System.out.println("������ �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "������":
				if (title.equals(horror[5]))
					System.out.println("������ �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "���̾�":
				if (title.equals(horror[6]))
					System.out.println("���̾� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			default:
				System.out.println();
				System.out.println("��ȸ��" + cnt2 + "�� ���ҽ��ϴ�.");

				isCorrect = false;

				if (cnt2 == 0) {
					isCorrect = true;
				}
				break;
			}
			if (isCorrect)
				break;
		}
		if (cnt2 != 0) {
			System.out.println(cnt + " ������ �����ϼ̽��ϴ�.\n");
			System.out.println("���ھ� 1���� ȹ���մϴ�.");
			System.out.println("��ȭ ���� ������ ������ �����մϴ�.");
			System.out.println("����ȭ������ ���ư��ϴ�.");
			System.out.println();
		} else {
			System.out.println();
			System.out.println();
			System.out.println("Ǳ! ���� ȹ�濡 �����߽��ϴ�.");
			System.out.println("��ȭ ���� ������ ������ �����մϴ�.");
			System.out.println("����ȭ������ ���ư��ϴ�.");
			System.out.println();
		}
	}

	public void showMov2() {

		boolean isCorrect = false;
		int cnt = 0;
		int cnt2 = 0;

		// ���������� ����
		System.out.println("���̵� ������ ���� ���������� ������ �����մϴ�!");
		System.out.println("�̱�� 6����  ��ȸ��, ���� 4��, ���� 2���� ��ȸ�� �־����ϴ�.");
		RockGame newStart = new RockGame();
		cnt2 = newStart.rockGame();

		// ����
		String[] questions = { "���� �ʼ��� �´� ������ȭ��?", "���� �ʼ��� �´� �׼ǿ�ȭ��?", "���� �ʼ��� �´� �ִϸ��̼���?" };

		// �׼� : "����", "������ ����", "������", "���˵���", "���׶�", "����", "Ʈ��������"
		String[] action = { "'����'"+"\n"+"(hint: 2014����~, �ܱ���ȭ, �������� �ǵ��� ����)", 
				"'������ ����'"+"\n"+"(hint: 2014����~, �ܱ���ȭ, �丶���� �̷� Ż��)", 
				"'������'"+"\n"+"(hint: 2010����, ������ȭ, �̰� ��ź������ ��xx��!!!!!)", 
				"'��������'"+"\n"+"(hint: 2017����~, ������ȭ, ���� ��þ�̾�!!!!!!)", 
				"'������'"+"\n"+"(hint: 2015����, ������ȭ, �˵� �����̸� ���̶�� �ؿ�.)", 
				"'����'"+"\n"+"(hint: 2019����, ������ȭ, ������ ���̽� )", 
				"'����������'"+"\n"+"(hint: 2007����~, �ܱ���ȭ, ��Ƽ�ӽ� ������)" };

		Random rand2 = new Random();

		System.out.println("------------------------------------------------");
		System.out.println(questions[1]);
		System.out.println(action[rand2.nextInt(7)]);
		System.out.println();

		while (true) {
			System.out.print("���� �Է�>>");
			String title2 = this.sc.nextLine();
			cnt += 1;
			cnt2 -= 1;

			switch (title2) {

			case "����":
				if (title2.equals(action[0]))
					System.out.println("���� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "������ ����":
				if (title2.equals(action[1]))
					System.out.println("������ ���� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "������":
				if (title2.equals(action[2]))
					System.out.println("������ �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "���˵���":
				if (title2.equals(action[3]))
					System.out.println("���˵��� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "���׶�":
				if (title2.equals(action[4]))
					System.out.println("���׶� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "����":
				if (title2.equals(action[5]))
					System.out.println("���� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "Ʈ��������":
				if (title2.equals(action[6]))
					System.out.println("Ʈ�������� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			default:
				System.out.println();
				System.out.println("��ȸ��" + cnt2 + "�� ���ҽ��ϴ�.");
				isCorrect = false;
				if (cnt2 == 0) {
					isCorrect = true;
				}
				break;
			}
			if (isCorrect)
				break;
		}
		if (cnt2 != 0) {
			System.out.println(cnt + " ������ �����ϼ̽��ϴ�.\n");
			System.out.println("���ھ� 1���� ȹ���մϴ�.");
			System.out.println("��ȭ ���� ������ ������ �����մϴ�.");
			System.out.println("����ȭ������ ���ư��ϴ�.");
			System.out.println();
		} else {
			System.out.println();
			System.out.println();
			System.out.println("Ǳ! ���� ȹ�濡 �����߽��ϴ�.");
			System.out.println("��ȭ ���� ������ ������ �����մϴ�.");
			System.out.println("����ȭ������ ���ư��ϴ�.");
			System.out.println();
		}
	}

	public void showMov3() {

		boolean isCorrect = false;
		int cnt = 0;
		int cnt2 = 0;

		// ���������� ����
		System.out.println("���̵� ������ ���� ���������� ������ �����մϴ�!");
		System.out.println("�̱�� 6����  ��ȸ��, ���� 4��, ���� 2���� ��ȸ�� �־����ϴ�.");
		RockGame newStart = new RockGame();
		cnt2 = newStart.rockGame();

		// ����
		String[] questions = { "���� �ʼ��� �´� ������ȭ��?", "���� �ʼ��� �´� �׼ǿ�ȭ��?", "���� �ʼ��� �´� �ִϸ��̼���?" };

		// �ִϸ��̼� : "�̿��� �����", "¯���� ������", "�Ͽ��� �����̴� ��", "�͸��� Į�� ���ѿ���", "��Ƴ�", "�ܿ�ձ�",
		// "���ɰ���"
		String[] anime = { "������ ������"+"\n"+"(hint: 1988����, �̾���Ű �Ͼ߿�, �Ŵ��䳢)", 
				"������ ������"+"\n"+"(hint: 1992����~, �����, õ������ �󷷶׶�)", 
				"������ �������� ��"+"\n"+"(hint: 2004����, ���긮, ���Ǵ� �ҸӴ�)", 
				"������ ���� ��������"+"\n"+"(hint: 2021����, ������, ������ ȣ�� �� 1���� �����ϼ�!)", 
				"������"+"\n"+"(hint: 2017����, �����, How Far I'll Go)", 
				"��������"+"\n"+"(hint: 2014����~, �����, Let It Go)", 
				"��������" +"\n"+"(hint: 1997����~, �̾���Ű �Ͼ߿�, ����ҳ�)"};

		Random rand2 = new Random();

		System.out.println("------------------------------------------------");
		System.out.println(questions[2]);
		System.out.println(anime[rand2.nextInt(7)]);
		System.out.println();

		// �ִϸ��̼�
		while (true) {
			System.out.print("���� �Է�>>");
			String title3 = this.sc.nextLine();
			cnt += 1;
			cnt2 -= 1;

			switch (title3) {

			case "�̿��� �����":
				if (title3.equals(anime[0]))
					System.out.println("�̿��� ����� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "¯���� ������":
				if (title3.equals(anime[1]))
					System.out.println("¯���� ������ �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "�Ͽ��� �����̴� ��":
				if (title3.equals(anime[2]))
					System.out.println("�Ͽ��� �����̴� �� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "�͸��� Į�� ���ѿ���":
				if (title3.equals(anime[3]))
					System.out.println("�͸��� Į�� ���ѿ��� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "��Ƴ�":
				if (title3.equals(anime[4]))
					System.out.println("��Ƴ� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "�ܿ�ձ�":
				if (title3.equals(anime[5]))
					System.out.println("�ܿ�ձ� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "���ɰ���":
				if (title3.equals(anime[6]))
					System.out.println("���ɰ��� �����Դϴ�.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			default:
				System.out.println();
				System.out.println("��ȸ��" + cnt2 + "�� ���ҽ��ϴ�.");
				isCorrect = false;
				if (cnt2 == 0) {
					isCorrect = true;
				}
				break;
			}
			if (isCorrect)
				break;
		}
		if (cnt2 != 0) {
			System.out.println(cnt + " ������ �����ϼ̽��ϴ�.\n");
			System.out.println("���ھ� 1���� ȹ���մϴ�.");
			System.out.println("��ȭ ���� ������ ������ �����մϴ�.");
			System.out.println("����ȭ������ ���ư��ϴ�.");
			System.out.println();
		} else {
			System.out.println();
			System.out.println();
			System.out.println("Ǳ! ���� ȹ�濡 �����߽��ϴ�.");
			System.out.println("��ȭ ���� ������ ������ �����մϴ�.");
			System.out.println("����ȭ������ ���ư��ϴ�.");
			System.out.println();
		}
	}

}

//�޼ҵ� ����
//	public void more() {
//		System.out.println("��ȭ ���� ���߱� ������ �����մϴ�.");
//		System.out.println("����ȭ������ ���ư��ϴ�.");
//		System.out.println();
//		MovieGame.finish = true; 
//	}