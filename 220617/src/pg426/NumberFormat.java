package pg426;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormat {
	public static void main(String[] args) {
//		String data2 = "a100";
		for(;;) {
		System.out.print("���� �Է��ϼ���>>");
		Scanner scan = new Scanner(System.in);
		try{
			int nn = scan.nextInt();
			System.out.println(nn);
		} catch(InputMismatchException e) {
			System.out.println("�ٽ� �Է�");
		}
		//System.out.println(Integer.parseInt(data2));
	}
	}
}
