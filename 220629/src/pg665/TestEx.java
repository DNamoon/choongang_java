package pg665;

public class TestEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stirng ss = Util.compare(5, 10);  //오류 Util 클래스 Number 제한 타입이여서
		
		int ret = Util.compare(10, 20.5);
		System.out.println(ret);
		
		Integer a = 10;
		System.out.println(a);
		System.out.println(a=15);
		
		Integer b = new Integer(10);
		System.out.println(b);
		System.out.println(b=12);
	}

}
