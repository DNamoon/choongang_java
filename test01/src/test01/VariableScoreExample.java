package test01;

public class VariableScoreExample {
	
	public static void main (String[] args) {
		int v1 = 15;
		int v2 = 0;
		if(v1>10) {
			v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 +5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
		
		System.out.println(v3);
		int $3 = 34;
		System.out.println($3);
		
		int v4 = 5;
		
		System.out.println("v4");
		System.out.println("\tv4");
		
	}

}
