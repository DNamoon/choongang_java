package finalTeamProject0;
//영단어게임을 메소드(hang)로 만들었습니다. + 게임시작 안내문(hangstart)을 추가했습니다.
import java.util.Scanner;

import finalTeamProject0.*;


public class HangGame extends MiniGame {
	
	public void hangstart(){
		Out : for(;;) {
			System.out.println();
			System.out.println("영단어 맞히기 게임을 시작하시겠습니까? ");
			System.out.println("==========================================");
			System.out.println("1.YES | 2. NO");
			System.out.println("==========================================");
		
			System.out.print("answer >>");
			Scanner scan = new Scanner(System.in);
			int answer = scan.nextInt();
		
			switch(answer) {
				case 1 : 
					RockGameHang rgh = new RockGameHang();
					int num = rgh.rockGame();
					HangGame game2 = new HangGame();
					game2.hang(num);
					break;	
				case 2:
					System.out.println("영단어 맞히기 게임을 종료합니다.");
					System.out.println("메인화면으로 돌아갑니다.");
					System.out.println();
					break Out;
			}
		}
	}
	
				//매개변수 a는 알파벳 맞힐 수 있는 횟수
	public int hang(int a) {
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("<영단어 맞히기 게임>을 시작합니다");
		System.out.println("------------------------");

		Scanner scan = new Scanner(System.in);

		List ll = new List();
		String qq = ll.question(ll.pickWord.length());

	
		System.out.println("글자수 ["+ll.pickWord.length()+"]개의 단어입니다.");
		System.out.println();


		for(int i=a;i>0;i--) {
			System.out.println(i+"번의 기회가 남았습니다.");
			System.out.print("알파벳을 입력하세요>> ");
			String alphabet = scan.nextLine();
		
			if(alphabet.equals("")) {
				System.out.println("값을 입력하세요.");
				System.out.println();		
			
			}else if(ll.pickWord.contains(alphabet)) {
				System.out.println(alphabet + "을(를) 포함하고 있습니다.");
			
				//앞의문자열+해당인덱스의 알파벳+뒤의 문자열 : 해당 위치의 ?를 입력받은 알파벳으로 바꾼다
				qq = qq.substring(0,ll.pickWord.indexOf(alphabet))+
						alphabet+
						qq.substring(ll.pickWord.indexOf(alphabet)+1);
				System.out.println();

			} else {
				System.out.println(alphabet + "을(를) 포함하지 않습니다.");
				System.out.println();
			}

			System.out.println(qq);
		}

		System.out.println("------------------------");
	
		AAA: for (;;) {
			for (int j=3;j>0;j--) {
				System.out.println(j+"번의 기회가 남았습니다.");
				System.out.print("[정답]을 입력하세요>> ");
				String word = scan.nextLine();
					if (word.equals(ll.pickWord)) {
						System.out.println("정답입니다");
						System.out.println();
						System.out.println("!승리했습니다!");
						System.out.println("획득한 점수는 1점 입니다.");
						scoreOfB += 1;
						break AAA;
					} else if(word.equals("")) {
						System.out.println("답을 입력하세요");
						System.out.println();
					} else { 
						System.out.println("틀렸습니다");
						System.out.println();
						
					} 
				}

			System.out.println("~패배했습니다~");
			System.out.println("획득한 점수는 0점 입니다.");
			scoreOfB += 0;
			break;

		}
		return scoreOfB;
	} 
}