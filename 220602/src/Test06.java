
public class Test06 {
	public static void main(String[] args) {
		int a[] = {4,5,6,7,3,10,2, 8};
		
		int max = a[0];
		int min = a[0];
		//�ִ� ã�� �ڵ� ã�ƺ���
		
		for (int i=0;i<a.length;i++) {
			if (max<a[i]) {
				max=a[i];
			}
			if (min >a[i]) {
				min = a[i];
			}
		}
		
		System.out.println("�ִ밪:" + max);
		System.out.println("�ּڰ�:" + min);
	}

}
