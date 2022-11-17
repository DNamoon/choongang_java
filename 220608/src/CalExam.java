
public class CalExam {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.printPlus(10, 20);
		int num = cal.plus(40, 50);
		System.out.println(num);
		System.out.println();
		
		System.out.println(cal.plus(20, 30));
		System.out.println(cal.avg(40, 20));
		
	}
}
