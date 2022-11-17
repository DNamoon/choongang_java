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
//			System.out.println("클래스가 존재하지 않습니다.");
//		}

	}

}
