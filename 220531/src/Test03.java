
public class Test03 {
	public static void main(String[] args) {
		String ss1 = "������";
		String ss2 = "������";
		String ss3 = new String("������");
		//�ּҰ��� ���ϴ� ��! ss1,ss2�� "������" ��� ������ �ּ� ������.
		//ss3�� ���ο� ��ü�� ����ſ��� �ٸ� �ּ�
		
		boolean result = (ss1 == ss2);
		System.out.println(result);
		System.out.println(ss1 == ss3);
		System.out.println(ss1.equals(ss3));
		
	}
}
