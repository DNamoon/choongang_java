package test;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char alp = 'A'; alp <= 'Z'; alp++) {
			System.out.println(alp);
			   if (alp == 'K') {
			      break ;    // 반복문을 탈출
			   }
			}
		
		System.out.println();
		Out:for (char alp2 = 'A'; alp2 <= 'Z'; alp2++) {
			System.out.println(alp2);
			   if (alp2 == 'K') {
			      break Out;    // 반복문을 탈출
			   }
			}
	}

}
