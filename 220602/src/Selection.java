
public class Selection {
	public static void main(String[] args) {
		int a[] = {10,3,1,4,2};
		
		
		//인덱스 첫번째부터 최솟값을 순서대로 채운다.
		//a[i] 값을 최솟값으로 예상하고 2~a.length 인덱스 값과 비교한다.
		//비교한 값 중에서 최솟값을 min으로 지정한다.(아직 자리 바꾸기x)
		//모든 인덱스 값을 비교한 후 찾은 min을 a[i]번째 자리로 가져온다.
		//이 방법을 a.length번 반복한다.
		
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
