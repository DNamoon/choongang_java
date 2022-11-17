
public class Test10 {
	public static void main(String[] args) {
		double sc = 78;
		//int sc = (int)(Math.random()*100)+1;
		String ss ="" ;
		
		if(sc>100 ||sc<0) {
			System.out.println("입력오류!");
		}else {
			switch((int) sc/10) {
			case 9:
				ss = "수";
				break;
			case 8:
				ss = "우";
				break;
			case 7:
				ss = "미";
				break;
			case 6:
				ss = "양";
				break;
			case 5:
				ss = "가";
				break;
			default:
				ss = "재시험";
				break;			
			}
		}
		
//		if (sc> 100 || sc< 0) {
//			System.out.println("입력오류!");
//		} else {
//		
//		if(sc <= 100 && sc >= 90) {
//			ss = "수";
//		}else if(sc >= 80) {
//			ss = "우";
//		}else if(sc >= 70) {
//			ss = "미";
//		}else if(sc >= 60) {
//			ss = "양";
//		}else if(sc < 60 && sc >=0) {
//			ss = "가";
//		}
//	}
		System.out.println("점수: " + sc +", " + ss);
		System.out.println(ss);
	}


}
