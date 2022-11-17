import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		String[] memo = {"가나다","라마바","abc", "ABC"};
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("줄수를 입력하세요.>>>");
		//Scanner scanner = new Scanner(System.in);
		int kk = scanner.nextInt();
		memo = new String[kk];
		
		for(int i=0;i<memo.length;i++) {
			System.out.print("입력>");
			String ss = scanner.next();
			memo[i] = ss;
		}
		
		printMemo(memo);
	}
	
	public static void printMemo(String[] ss) {
		for(int i=0;i<ss.length;i++) {
			System.out.println(ss[i]);
		}
	}
}
