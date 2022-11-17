
public class Calculator {
	
	double avg(int x, int y) {
		return (double)plus(x,y)/2.0; 
	}
	
	void printPlus(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
		//return ;
	}
		
	int plus(int x, int y) {
		return x+y;
	}
	//오버로딩
	void plus(String x, String y) {	
	}
	int plus(int x, int y, int z) {
		return x;
	}
}
