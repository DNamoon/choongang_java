
public class Test07 {
	public static void main(String[] args) {
		int n = 15;
		int f = 1;
		for(int i=1;i<=n;i++) {
			f = f*i;
			System.out.println(i+"번째: "+ f);
		}
		System.out.println(n+"!= " + f);
		System.out.println(n+"!="+fact(n));
		//함수 호출하는 법 모르나본데?
		
		
	}
	
	public static int fact(int n) {
		if(n<=1) {
			return 1;
		}else {
			return fact(n-1)*n;//재귀 호출
		}
	}

}
