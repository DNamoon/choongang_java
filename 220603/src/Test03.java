
public class Test03 {
	public static void main(String[] args) {
		int[][] arr = {{95,80},{77,88,90}};
		System.out.println(arr[1][2]);
		System.out.println("=======================");
		for(int i=0; i<arr.length ;i++) {
			System.out.println(arr[i].length);
			System.out.println("=======================");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
