
public class Test03 {
	public static void main(String[] args) {
		String ss1 = "가나다";
		String ss2 = "가나다";
		String ss3 = new String("가나다");
		//주소값을 비교하는 것! ss1,ss2는 "가나다" 라는 동일한 주소 가진다.
		//ss3는 새로운 객체를 만든거여서 다른 주소
		
		boolean result = (ss1 == ss2);
		System.out.println(result);
		System.out.println(ss1 == ss3);
		System.out.println(ss1.equals(ss3));
		
	}
}
