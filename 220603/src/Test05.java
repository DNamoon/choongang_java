
public class Test05 {
	public static void main(String[] args) {
		int[] arr = {30,40,50};
		int[] arr2 = new int[arr.length];
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		
//		for(int i=0; i<arr.length;i++) {
//				arr2[i] = arr[i];
//		}
		
		for(int cc: arr2) {
			System.out.println(cc);
		}
	}

}
