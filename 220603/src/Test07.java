
public class Test07 {
	public static void main(String[] args) {
		int n = 15;
		int f = 1;
		for(int i=1;i<=n;i++) {
			f = f*i;
			System.out.println(i+"��°: "+ f);
		}
		System.out.println(n+"!= " + f);
		System.out.println(n+"!="+fact(n));
		//�Լ� ȣ���ϴ� �� �𸣳�����?
		
		
	}
	
	public static int fact(int n) {
		if(n<=1) {
			return 1;
		}else {
			return fact(n-1)*n;//��� ȣ��
		}
	}

}
