
public class Test03 {
	public static void main(String[] args) {
		double[] sc = {89.5,67.75,58.45,59.44,87.7,25.57,67.4,88.1,92.9,46.39};
	
		
//		System.out.println(sc[0]);
//		System.out.println(sc[1]);
//		System.out.println(sc[2]);
		sc[5] = 55;
		System.out.println(sc.length);
		System.out.println("=================");
		double sum = 0;
		for(int i =0;i<10;i++) {
//			System.out.print(i+1 +"��°:");
//			System.out.println(sc[i]);
			sum += sc[i];
			System.out.println(i+1 +"��°:"+ sc[i]+"��");
			
		}
		System.out.println("������ " + sum + "���Դϴ�.");
		System.out.println("����� " + (double)sum/sc.length + "���Դϴ�.");
		
	}

}
