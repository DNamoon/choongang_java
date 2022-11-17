package mini_project;

import java.util.Scanner;

public class RockExam {
	public static void main(String[] args) {
		int com = (int)(Math.random()*3)+1 ;
		
		System.out.println("------------------------------");
		System.out.println("가위바위보를 합시다!");
		System.out.println("1. 가위  | 2. 바위  | 3. 보 ");
		System.out.println("------------------------------");
		System.out.print("선택하세요! >>>");
		
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		
		if(com == 1) { //1을 가위, 2를 바위, 3을 보라고 약속!
			if(user == 1) {  //컴퓨터 가위, 사용자 가위
				System.out.println("비겼습니다. 맞출 기회는 4번입니다.");				
			} else if(user == 2) {  //컴퓨터 가위, 사용자 바위
				System.out.println("이겼습니다. 맞출 기회는 6번입니다.");
			} else if(user == 3) {  //컴퓨터 가위, 사용자 보
				System.out.println("졌습니다. 맞출 기회는 2번입니다.");
			}
		} else if (com == 2) {
			if(user == 1) {  //컴퓨터 바위, 사용자 가위
				System.out.println("졌습니다. 맞출 기회는 2번입니다.");				
			} else if(user == 2) {  //컴퓨터 바위, 사용자 바위
				System.out.println("비겼습니다. 맞출 기회는 4번입니다.");
			} else if(user == 3) {  //컴퓨터 바위, 사용자 보
				System.out.println("이겼습니다. 맞출 기회는 6번입니다.");
			}
		} else if (com ==3) {
			if(user == 1) {  //컴퓨터 보, 사용자 가위
				System.out.println("이겼습니다. 맞출 기회는 6번입니다.");				
			} else if(user == 2) {  //컴퓨터 보, 사용자 바위
				System.out.println("졌습니다. 맞출 기회는 2번입니다.");
			} else if(user == 3) {  //컴퓨터 보, 사용자 보
				System.out.println("비겼습니다. 맞출 기회는 4번입니다.");
			}
		}
		System.out.println("com의 숫자는 " + com + "입니다.");
		
		if(com == user) {
			System.out.println("비겼습니다. 맞출기회는 4번입니다.");
		}
		
		
		
		
		
		
		
	}

}
