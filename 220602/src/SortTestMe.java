
public class SortTestMe {
	public static void main(String[] args) {
		int a[] = {3,5,1,5,10,6};
		
		for (int i=0;i<a.length-1;i++) {
			for(int j=a.length-1;j<i;j--) {
				if(a[j]<a[j-1]) {
					int tmp = a[j-1];
					a[j-1] = a[j];
					a[j] = tmp;
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+"/");
		}
	}
}
