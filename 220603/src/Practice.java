
public class Practice {
	public static void main(String[] args) {
		int[][] mathScores = new int [2][3];
		System.out.println(mathScores[0].length);
		
		for(int i=0; i<mathScores.length;i++) {
			for(int k=0; k<mathScores[i].length;k++) {
				System.out.println("mathScores["+i+"]["+k+"] ="+mathScores[i][k]);
			}
			System.out.println();
						
		}
		System.out.println("==============================");
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		englishScores[0][0] = 3;
		
		for(int i=0; i<englishScores.length;i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				englishScores[i][k] = i+k+1;
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95,80},{92,96,80}};
		//밑에랑 위에랑 같은 표현.
		//int[][] javaScores = new int[2][];
		//javaScores[0] = new int[2];
		//javaScores[1] = new int[3];
		
		//javaScores에 들어가 있는 모든 값을 행렬처럼 읽고 싶은것!
		for(int i=0; i<javaScores.length;i++) {
			for(int k=0; k<javaScores[i].length;k++) {
				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
			}
		}
	}

}
