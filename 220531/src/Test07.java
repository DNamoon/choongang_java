
public class Test07 {
	public static void main(String[] args) {
		//int sc = 78;
		int sc = (int)(Math.random()*100)+1;
		String ss = "";
		
		if (sc> 100 || sc< 0) {
			System.out.println("입력오류!");
		} else {
		
		if(sc <= 100 && sc >= 90) {
			ss = "수";
		}else if(sc >= 80) {
			ss = "우";
		}else if(sc >= 70) {
			ss = "미";
		}else if(sc >= 60) {
			ss = "양";
		}else if(sc < 60 && sc >=0) {
			ss = "가";
		}
		}
		System.out.println("점수: " + sc +", " + ss);
		System.out.println(ss);
	}

}
