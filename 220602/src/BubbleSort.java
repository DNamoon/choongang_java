
public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {10, 3, 1, 4, 2};
		
		//�������� �����Ʈ
		//int b = a.length;
		for(int i=0;i<a.length-1;i++) {
			for(int j=a.length-1;j>i;j--) {
				//System.out.println(i+","+j);
				if(a[j-1]>a[j]) {
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1]=tmp;
				}
			}
			System.out.println("=========");
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +"/ ");
		}
		
		//�������� �����Ʈ
		for(int i=0;i<a.length-1;i++) {
			for(int j=a.length-1;j>i;j--) {
				//System.out.println(i+","+j);
				if(a[j-1]< a[j]) {
					int tmp = a[j-1];
					a[j-1] = a[j];
					a[j]=tmp;
				}
			}
			System.out.println("=========");
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +"/ ");
		}
	}

}
