
public class Test_me {
	public static void main(String[] args) {
		// 1부터 100까지 합을 구하기 위해 for문 대신 while문을 사용해보자.
		int sum = 0;
		int i=1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~100까지의 합: " + sum);
	}

}
