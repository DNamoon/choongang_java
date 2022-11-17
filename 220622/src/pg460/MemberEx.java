package pg460;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("가나다");
		Member m2 = new Member("가나다");
		Member m3 = new Member("라마바");
		
		String s1 = "가나다";
		String s2 = new String("가나다");
		
		System.out.println(s1.equals(s2));
		
		//객체가 다르다.
		if(m1.equals(m2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
	}

}
