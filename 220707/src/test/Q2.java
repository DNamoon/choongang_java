package test;

public class Q2 {

	public static void main(String[] args) {
		//�������� ����ϴ� ���α׷�
		//���� for��
		for(int i=2;i<10;i++) {
			System.out.println("============"+i+"��============");
			for(int j=1;j<10;j++) {
				System.out.println(i+" X " + j + " = " + i*j);
			}
		}
		
		//while��
		int a = 2;
		int b = 1;
		while(a<10) {
			System.out.println("============"+a+"��============");
			while(b<10) {
				
				System.out.println(a+" X " + b + " = " + a*b);
				b++;
			}
			a++;
			b=1;
		}
		
	}

}
