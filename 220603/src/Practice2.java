import java.util.Arrays;

public class Practice2 {
	public static void main(String[] args) {
//		int[][] scores = new int[2][3];
//		System.out.println(scores.length); //���� 2
//		System.out.println(scores[0].length); //���� 3
//		System.out.println(scores[1].length);//���� 3
//		System.out.println("=======================");
//		
//		int[][] numbers = new int[2][];
//		numbers[0] = new int[2];
//		numbers[1] = new int[3];
//		
//		System.out.println(numbers.length); //����2
//		System.out.println(numbers[0].length);//���� 2
//		System.out.println(numbers[1].length);	//���� 3
//		
//		int[][] sc = {{10,20},{30,40}};
//		int s = sc[0][0]; //10
//		int s2 = sc[1][1];//40
//		System.out.println(s+","+s2);
//		String[] strArray = new String[3];
//		
//		strArray[0] = "java";
//		strArray[1] = "java";
//		strArray[2] = new String("java");
//		System.out.println(strArray[0] == strArray[1]);
//		System.out.println(strArray[0] == strArray[2]);
//		System.out.println(strArray[0].equals(strArray[2]));
//		String[] oldIntArray = {"java","array","copy"};
//		String[] newIntArray = new String[5];
		
//		for(int i=0; i<oldIntArray.length;i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
//		
//		for(int i=0; i<newIntArray.length;i++) {
//			System.out.print(newIntArray[i] + ",");
//		}
		
//		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
//		
//		for(int i=0; i<newIntArray.length;i++) {
//			System.out.print(newIntArray[i] + ",");
//		}
//		
//		int[] scores = {95, 71, 84,93, 87};
//		
//		int sum = 0;
//		for(int score : scores) {
//			sum += score;
//		}
//		System.out.println("���� ���� = " + sum);
//		
//		double avg = (double) sum/scores.length;
//		System.out.println("���� ��� = " + avg);
//		
//		
		int[] a = new int[100];
		
		for(int i=0;i<a.length;i++) {
			a[i]= i;
			//System.out.println("a["+i+"] �� ��: "+a[i]);
		}

		//System.out.println("a�迭�� ����: " + a.length);
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
