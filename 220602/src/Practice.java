
public class Practice {
	public static void main(String[] args) {
		int scores[];
		scores = new int[] {83,90,87};
		int sum1 = 0;
		for(int i=0;i<3;i++) {
			sum1 += scores[i];
		}
		System.out.println("????: " + sum1);
		
		//???ϵ? ?????? sum2?? ????
		
		int sum2 = add( new int[] {83,90,87});
		System.out.println("????: " + sum2);
		System.out.println();
		
	}

	private static int add(int[] is) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += is[i];
		}
		return sum;
	}

}
