package pg460;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("������");
		Member m2 = new Member("������");
		Member m3 = new Member("�󸶹�");
		
		String s1 = "������";
		String s2 = new String("������");
		
		System.out.println(s1.equals(s2));
		
		//��ü�� �ٸ���.
		if(m1.equals(m2)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
	}

}
