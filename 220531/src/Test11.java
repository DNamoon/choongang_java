
public class Test11 {
	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		for(;i<10;i++) {//���� i�� 0���� 1�� ���ϴ� ������ 10�� �ݺ� - �⺻���� Ʋ�� �ܿ�����
			sum += i;
			System.out.println(i +","+ sum);
			//i++;
			
			//System.out.println(i+"��°: " + sum);
		}
		System.out.println(sum);
		System.out.println(i-1);
	}

}
