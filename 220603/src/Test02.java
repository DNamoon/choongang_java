
public class Test02 {
	public static void main(String[] args) {
		
//		if(args.length != 2) {
//			System.out.println("����: java Test02 ����1 ����2" );
//			System.exit(0);
//		}
		int[] arr;
		arr = new int[args.length];
		int sum = 0;
		
		for(int i=0;i<arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
			sum += arr[i];
		}
		System.out.println("����: " + sum);
		for(int nn:arr) {
			System.out.println(nn);
		}
		System.out.println("========================");
		System.out.println("�迭 args�� ����: " + args.length);
//		int nn1 = Integer.parseInt(args[0]);
//		int nn2 = Integer.parseInt(args[1]);
//		
//		System.out.println(args[0]);
//		System.out.println(args[1]+args[0]);
//		System.out.println(nn1+nn2);
	}

}