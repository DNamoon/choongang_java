import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		int a[] = {10,3,1,4,2};
		//Scanner scan = new Scanner(System.in);  // Scanner�� �޾ƿ��� �Է°� ã�� �;��µ� if������ Scanner �� �޳���.
		
		//4�� ã�Ƽ� �ε����� ���.
		for (int i=0;i<a.length;i++) {
			if(a[i] == 4) {
				System.out.println(a[i] + "," + i + "��° �ε����� ��ġ�� �ֽ��ϴ�.");
			}
		}
		
	}

}
