import java.util.Scanner;

public class Test01 {
	public enum ���� {��,ȭ,��,��,��,��,��}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.print("���� �Է� >>>");
		String ss = scan.nextLine();
		Week tt = null;
		���� yy = null;
		���� kk = yy.valueOf(ss);
		
		
			
		switch(kk) {
		case ��:
			System.out.println(kk.name());
			break;
		case ȭ:
			System.out.println();
			break;
		/*case 4:
			System.out.println(Week.WEDNESDAY);
			break;
		case 5:
			System.out.println(Week.THURSDAY);
			break;
		case 6:
			System.out.println(Week.FRIDAY);
			break;
		case 7:
			System.out.println(Week.SATURDAY);
			break;
		case 8:
			System.out.println(Week.SUNDAY);*/
			
		}
	}

}
