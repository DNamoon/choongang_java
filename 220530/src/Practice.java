public class Practice {
	public static void main (String[] args) {
//		int v1 = 10;
//		int v2 = ~v1;
//		int v3 = ~v1 +1;
//		System.out.println(toBinaryString(v1) + "(십진수: " + v1 + ")");
//		System.out.println(toBinaryString(v2) + "(십진수: " + v2 + ")");
//		System.out.println(toBinaryString(v3) + "(십진수: " + v3 + ")");
//		System.out.println();
//		
//		int v4 = -10;
//		int v5 = ~v4;
//		int v6 = ~v4 + 1;
//		System.out.println(toBinaryString(v4) + "(십진수: " + v4 + ")");
//		System.out.println(toBinaryString(v5) + "(십진수: " + v5 + ")");
//		System.out.println(toBinaryString(v6) + "(십진수: " + v6 + ")");
//		
//	}
//
//	private static String toBinaryString(int value) {
//		// TODO Auto-generated method stub
//		String str = Integer.toBinaryString(value);
//		while(str.length() < 32) {
//			str = "0" + str;
//		}
//		return str;
//		int x = 1000000;
//		long y = 1000000;
//		long z = x*y;
//		
//		System.out.println(z);
		
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
		
	}



	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left<(Integer.MIN_VALUE -right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
