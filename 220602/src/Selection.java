
public class Selection {
	public static void main(String[] args) {
		int a[] = {10,3,1,4,2};
		
		
		//�ε��� ù��°���� �ּڰ��� ������� ä���.
		//a[i] ���� �ּڰ����� �����ϰ� 2~a.length �ε��� ���� ���Ѵ�.
		//���� �� �߿��� �ּڰ��� min���� �����Ѵ�.(���� �ڸ� �ٲٱ�x)
		//��� �ε��� ���� ���� �� ã�� min�� a[i]��° �ڸ��� �����´�.
		//�� ����� a.length�� �ݺ��Ѵ�.
		
		for(int i=0; i<a.length-1;i++) {
			int min = a[i];
			int idx = i;
			for(int j =i+1;j<a.length;j++) {
				if(min>a[j]) {
					min = a[j];
					idx=j;
				}
			}
			int tmp = a[i];
			a[i] = a[idx];
			a[idx] = tmp;
		}
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+"/");
		}
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
