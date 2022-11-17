package pg424;

public class ArrayIndexExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(args[0]);
		int[] nn = {12, 34, 56};
		for(int i=0; i<5; i++) {
			
			try {
				System.out.println(nn[i]);			
			} catch (ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("ÀÎµ¦½º ¹üÀ§¸¦ ¹þ¾î³²");
			}
		}
	}

}
