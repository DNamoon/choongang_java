package test02;

public class ByteExam {
	public static void main(String[] args) {
		//byte var5 = 128;
		//System.out.println();
		char c1 ='a';
		char c2 = 'A';
		String c3 = "as";
		System.out.println(c3);
		
		System.out.println(c1+","+c2);
		
		byte var1 = 125;
		int var2 = 125;
		byte i=0;
		
		for(; i<5; i++) { //무한루프
			var1++;
			var2 = var2 +1;
			System.out.println(var1 + ","+var2);
			System.out.println(i);
		}
		System.out.println("---");
		System.out.println(i);
		//System.out.println("---");
		
	}

}
