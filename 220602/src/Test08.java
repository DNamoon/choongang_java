import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		int a[] = {10,3,1,4,2};
		//Scanner scan = new Scanner(System.in);  // Scanner로 받아오는 입력값 찾고 싶었는데 if문에서 Scanner 못 받나봐.
		
		//4를 찾아서 인덱스를 출력.
		for (int i=0;i<a.length;i++) {
			if(a[i] == 4) {
				System.out.println(a[i] + "," + i + "번째 인덱스에 위치에 있습니다.");
			}
		}
		
	}

}
