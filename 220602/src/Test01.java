
public class Test01 {
	public static void main(String[] args) {
		int i = 0;
		AAA:while(i<10) {
			int rr = (int)(Math.random()*6)+1;
			int aa = (int)(Math.random()*6)+1;
			
			switch(rr + aa) {
			case 7:
				System.out.println("½Â¸®");
				break;
			case 2:
				System.out.println("Á¾·á");
				break AAA;
			default:
				System.out.println("ÆÐ¹è");
			
		}
		
//		for(int i=0;i<10;i++) {
//			int rr = (int)(Math.random()*6)+1;
//			//System.out.println(rr);
//			int aa = (int)(Math.random()*6)+1;
//			
//			switch(rr + aa) {
//			case 7:
//				System.out.println("½Â¸®");
//				break;
//			default:
//				System.out.println("ÆÐ¹è");
//				break;
//			}
//		}
		  }
	}

}
