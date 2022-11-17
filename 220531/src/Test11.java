
public class Test11 {
	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		for(;i<10;i++) {//변수 i를 0부터 1씩 더하는 행위를 10번 반복 - 기본적인 틀로 외워두자
			sum += i;
			System.out.println(i +","+ sum);
			//i++;
			
			//System.out.println(i+"번째: " + sum);
		}
		System.out.println(sum);
		System.out.println(i-1);
	}

}
