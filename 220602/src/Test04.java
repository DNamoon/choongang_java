import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//int[] score = new int[3];
		int[] score;
//		score[2] = 75;
//		score[1] = 40;
//		score[0] = 90;
		Scanner scan = new Scanner(System.in);
		System.out.println("�ο� >");
		int kk = scan.nextInt();
		score = new int[kk];
		
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1)+"��° ������ �Է��ϼ���>>>");
			int nn = scan.nextInt();
			score[i] = nn;
		}
		System.out.println("==========��  ��==========");
//		int nn = scan.nextInt();
//		score[0] = nn;
//		
//		Scanner scan2 = new Scanner(System.in);
//		int nn2 = scan.nextInt();
//		score[1] = nn2;
//		
//		Scanner scan3 = new Scanner(System.in);
//		int nn3 = scan.nextInt();
//		score[2] = nn3;

		print(score);
		sum(score);
	}
	
	public static void print(int[] array) {
		
		for(int i=0; i<array.length; i ++) {
			System.out.println((i+1)+"��° ���� ������ " + array[i]+"���Դϴ�.");
		}
	}
		
	public static void sum(int[] array2) {
		int sum = 0;
		for (int i=0; i<array2.length;i++) {
			sum += array2[i];
		}
		System.out.println("������ " + sum+"���Դϴ�.");
	}
	

//	public static double avg(int[] array3) {
//		return (double) sum(array3)/array3.length;
//		
//	}
	
		
		
}


