import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for(;  a<10;a++) {
			System.out.println(a);
			
	
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		//StaticMe.method();
		
		int [][] scores = new int [2][];
		scores[0] = new int[3];
		scores[1] = new int[1];

		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		int[] old = {1,2,3};
		int[] neww = new int[5];
		
		for(int i=0;i<old.length;i++) {
			neww[i] = old[i];
		}
		
		
		
	}

}
