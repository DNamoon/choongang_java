import java.util.Scanner;

public class StudentTest {
	//책 5장 확인문제 09번
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		Student[]  stu = null;
		
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.학생등록 | 2. 점수리스트 | 3. 총점과 평균 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택>>>");
			int selectNo = sc.nextInt();
			//책에서는 if문을 썼는데 강사님은 switch
			switch(selectNo) {
			case 1:
				System.out.print("학생수 >>>");
				studentNum = sc.nextInt();
				stu = new Student[studentNum];
				//sc.nextLine();
				for(int i = 0;i<studentNum;i++) {
					sc.nextLine();
					System.out.print(i+1 + "번 학생이름> ");
					String name = sc.nextLine();
					System.out.print("국어 점수> ");
					int kor = sc.nextInt();
					System.out.print("수학 점수 > ");
					int math = sc.nextInt();
					System.out.print("영어 점수 > ");
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
				//System.out.println("1번 누름");
				//배열로 받아야 할거 같은데? student, name, 들어갈 공간이 없어.
				
			case 3: 
				for(Student st : stu) {
					System.out.println("총점"+": " + st.sum()+" ,평균: " + st.avg());
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
				System.out.println("국어 최고 점수는 " + kmax + "점입니다.");
				System.out.println("평균점수는 " + avg + "점입니다.");
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료합니다.");
				break;
			default:
				System.out.println("잘 못 입력하셨습니다. 다시 입력하세요.");
			}

		}
	}

}
