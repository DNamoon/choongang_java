package pg423;

public class NullExcept {

	public static void main(String[] args) {
		String ss = null;
		for(int i=0;i<10;i++) {
			
			try {
				System.out.println(ss.toString());			
			}catch(NullPointerException e) {
				System.out.println("널 포인트 예외");
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("끝");
		}
	}

}
