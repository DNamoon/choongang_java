package annotation;

public class TimeCheck {  //어노테이션이랑 관련이 없대.  //수행시간 얼마나 걸리나 체크해보는것 
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long sum = 0L;
		
		for(int i=0;i<100000000;i++) {
			sum = i;
		}
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end-start) + " ms");
		

	}
		
}
		
		

