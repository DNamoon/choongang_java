package Test;

public class TryCatch {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
//		try {
//		} catch(ClassNotFoundException e) {
//			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
//		}

	}

}
