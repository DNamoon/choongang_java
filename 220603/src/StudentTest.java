import java.util.Scanner;

public class StudentTest {
	//å 5�� Ȯ�ι��� 09��
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		Student[]  stu = null;
		
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.�л���� | 2. ��������Ʈ | 3. ������ ��� | 4.�м� | 5.���� ");
			System.out.println("------------------------------------------------------------");
			System.out.print("����>>>");
			int selectNo = sc.nextInt();
			//å������ if���� ��µ� ������� switch
			switch(selectNo) {
			case 1:
				System.out.print("�л��� >>>");
				studentNum = sc.nextInt();
				stu = new Student[studentNum];
				//sc.nextLine();
				for(int i = 0;i<studentNum;i++) {
					sc.nextLine();
					System.out.print(i+1 + "�� �л��̸�> ");
					String name = sc.nextLine();
					System.out.print("���� ����> ");
					int kor = sc.nextInt();
					System.out.print("���� ���� > ");
					int math = sc.nextInt();
					System.out.print("���� ���� > ");
					int eng = sc.nextInt();
					stu[i] = new Student(name,kor,math,eng);
					//System.out.print(stu[i].toString());
				}
				break;
			case 2:
				for(Student st : stu) {
					System.out.println(st.content());
				}
				break;
				//System.out.println("1�� ����");
				//�迭�� �޾ƾ� �Ұ� ������? student, name, �� ������ ����.
				
			case 3: 
				for(Student st : stu) {
					System.out.println("����"+": " + st.sum()+" ,���: " + st.avg());
				}
				break;
				
			case 4:
				int kmax = 0;
				int sum =0;
				double avg = 0;
				for(Student st: stu) {
					kmax = (kmax<st.kor)?st.kor:kmax;
					sum += st.kor;
				}
				avg = (double)sum/studentNum;
				System.out.println("���� �ְ� ������ " + kmax + "���Դϴ�.");
				System.out.println("��������� " + avg + "���Դϴ�.");
				break;
			case 5:
				run = false;
				System.out.println("���α׷� �����մϴ�.");
				break;
			default:
				System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}

		}
	}

}
