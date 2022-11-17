
public class Test06 {
	public static void main(String[] args) {
		int[][] arr = {{30,40,50},{50,60,70,80}};
		int[][] arr2 = new int[arr.length][];
		//int[][] arr2 = new int[arr[0].length][arr[1].length];
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr2[i].length);
			for(int cc:arr[i]) {
				System.out.print(cc+" ");
			}
			System.out.println();
		}
		System.out.println("==================");
		
		for(int i=0;i<arr2.length;i++) {
			for(int cc:arr2[i]) {
				System.out.print(cc+" ");
			}
			System.out.println();
		}
	}

}
