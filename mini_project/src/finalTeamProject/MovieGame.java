package finalTeamProject;

import finalTeamProject.*;
import java.util.Random;
import java.util.Scanner;

public class MovieGame extends MiniGame {

	String name;
//	public static boolean finish = false;  //제거
	static Scanner sc = new Scanner(System.in);

	public void MovieGame() {

		System.out.println("---------------------------");
		System.out.println("영화 제목 맞히기 게임");
		System.out.println("---------------------------");
		System.out.println("자신있는 장르를 선택해 주세요.");
		System.out.println("---------------------------");
		System.out.println("1. 호러 영화 | 2. 액션 영화 | 3. 애니메이션");
		System.out.println("---------------------------");
		System.out.print("선택>>");

		int choice = sc.nextInt();
		sc.nextLine();

		System.out.println();
		System.out.println(choice + "번을 선택하셨습니다.");

		if (choice == 1) {

			MovieGame m1 = new MovieGame();
			System.out.println("'호러 영화' 시작합니다.");
			System.out.println();
			m1.showMov1();
			System.out.println();
			System.out.println();

//			while (!MovieGame.finish) {
//
//				// 문제
//				m1.showMov1();
//
//				// 게임 더 하기
//				m1.more();
//				System.out.println();
//				System.out.println();
//			}

		} else if (choice == 2) {
			MovieGame m2 = new MovieGame();
			System.out.println();
			System.out.println("'액션 영화' 시작합니다.");
			System.out.println();
			m2.showMov2();
			System.out.println();

//			while (!MovieGame.finish) {
//				// 문제
//				m2.showMov2();
//				// 게임 더 하기
//				m2.more();
//				System.out.println();
//			}

		} else if (choice == 3) {
			MovieGame m3 = new MovieGame();
			System.out.println();
			System.out.println("'애니메이션' 시작합니다.");
			System.out.println();
			m3.showMov3();
			System.out.println();

//			while (!MovieGame.finish) {
//				// 문제
//				m3.showMov3();
//				// 게임 더 하기
//				m3.more();
//				System.out.println();
//			}
		}

	}

	public void movieStart() {
		Out: for (;;) {
			System.out.println();
			System.out.println("영화 제목 맞히기 게임을 시작하시겠습니까? ");
			System.out.println("==========================================");
			System.out.println("1.YES | 2. NO");
			System.out.println("==========================================");

			System.out.print("answer >>>");
			Scanner scan = new Scanner(System.in);
			int answer = scan.nextInt();

			switch (answer) {
			case 1:
				MovieGame game1 = new MovieGame();
				game1.MovieGame();
				break;
			case 2:
				System.out.println("영화 제목 맞히기 게임을 종료합니다.");
				System.out.println("메인화면으로 돌아갑니다.");
				System.out.println();
				break Out;
			}
		}

	}

	public void showMov1() {

		boolean isCorrect = false;
		int cnt = 0;
		int cnt2 = 0;

		// 가위바위보 실행
		System.out.println("난이도 조절을 위해 가위바위보 게임을 진행합니다!");
		System.out.println("이기면 6번의  기회가, 비기면 4번, 지면 2번의 기회가 주어집니다.");
		RockGame newStart = new RockGame();
		cnt2 = newStart.rockGame();

		// 질문
		String[] questions = { "다음 초성에 맞는 공포영화는?", "다음 초성에 맞는 액션영화는?", "다음 초성에 맞는 애니메이션은?" };

		// 공포 : "오멘", "주온", "사일런트 힐", "레지던트 이블", "컨저링", "곤지암", "알이씨"
		String[] horror = { "'ㅇㅁ'"+"\n"+"(hint: 1976년작, 외국영화, 데미안)",  //힌트 추가
				"'ㅈㅇ'"+"\n"+"(hint: 2015년작, 외국영화, 토시오)", 
				"'ㅅㅇㄹㅌ ㅎ'"+"\n"+"(hint: 2006년작, 외국영화, 사이렌)", 
				"'ㄹㅈㄷㅌ ㅇㅂ'"+"\n"+"(hint: 2002년작~, 외국영화, 좀비)", 
				"'ㅋㅈㄹ'"+"\n"+"(hint: 2013년작~, 외국영화, 엑소시즘)", 
				"'ㄱㅈㅇ'"+"\n"+"(hint: 2017, 국내영화, 병원)", 
				"'ㅇㅇㅆ'" +"\n"+"(hint: 2007년작~, 외국영화, 1인칭 좀비영화)"};
		

		Random rand2 = new Random();

		System.out.println("------------------------------------------------");
		System.out.println(questions[0]);
		System.out.println(horror[rand2.nextInt(7)]);
		System.out.println();

		// 호러영화
		while (true) {
			System.out.print("정답 입력>>");
			String title = this.sc.nextLine();

			cnt += 1;
			cnt2 -= 1;

			switch (title) {

			case "오멘":
				if (title.equals(horror[0]))
					System.out.println("오멘 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "주온":
				if (title.equals(horror[1]))
					System.out.println("주온 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "사일런트 힐":
				if (title.equals(horror[2]))
					System.out.println("사일런트 힐 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "레지던트 이블":
				if (title.equals(horror[3]))
					System.out.println("레지던트 이블 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "컨저링":
				if (title.equals(horror[4]))
					System.out.println("컨저링 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "곤지암":
				if (title.equals(horror[5]))
					System.out.println("곤지암 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "알이씨":
				if (title.equals(horror[6]))
					System.out.println("알이씨 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			default:
				System.out.println();
				System.out.println("기회가" + cnt2 + "번 남았습니다.");

				isCorrect = false;

				if (cnt2 == 0) {
					isCorrect = true;
				}
				break;
			}
			if (isCorrect)
				break;
		}
		if (cnt2 != 0) {
			System.out.println(cnt + " 번만에 성공하셨습니다.\n");
			System.out.println("스코어 1점을 획득합니다.");
			System.out.println("영화 제목 맞히기 게임을 종료합니다.");
			System.out.println("메인화면으로 돌아갑니다.");
			System.out.println();
		} else {
			System.out.println();
			System.out.println();
			System.out.println("풉! 점수 획득에 실패했습니다.");
			System.out.println("영화 제목 맞히기 게임을 종료합니다.");
			System.out.println("메인화면으로 돌아갑니다.");
			System.out.println();
		}
	}

	public void showMov2() {

		boolean isCorrect = false;
		int cnt = 0;
		int cnt2 = 0;

		// 가위바위보 실행
		System.out.println("난이도 조절을 위해 가위바위보 게임을 진행합니다!");
		System.out.println("이기면 6번의  기회가, 비기면 4번, 지면 2번의 기회가 주어집니다.");
		RockGame newStart = new RockGame();
		cnt2 = newStart.rockGame();

		// 질문
		String[] questions = { "다음 초성에 맞는 공포영화는?", "다음 초성에 맞는 액션영화는?", "다음 초성에 맞는 애니메이션은?" };

		// 액션 : "존윅", "메이즈 러너", "아저씨", "범죄도시", "베테랑", "뺑반", "트랜스포머"
		String[] action = { "'ㅈㅇ'"+"\n"+"(hint: 2014년작~, 외국영화, 강아지는 건들지 말자)", 
				"'ㅁㅇㅈ ㄹㄴ'"+"\n"+"(hint: 2014년작~, 외국영화, 토마스의 미로 탈출)", 
				"'ㅇㅈㅆ'"+"\n"+"(hint: 2010년작, 국내영화, 이거 방탄유리야 개xx야!!!!!)", 
				"'ㅂㅈㄷㅅ'"+"\n"+"(hint: 2017년작~, 국내영화, 내가 장첸이야!!!!!!)", 
				"'ㅂㅌㄹ'"+"\n"+"(hint: 2015년작, 국내영화, 맷돌 손잡이를 어이라고 해요.)", 
				"'ㅃㅂ'"+"\n"+"(hint: 2019년작, 국내영화, 조정석 레이싱 )", 
				"'ㅌㄹㅅㅍㅁ'"+"\n"+"(hint: 2007년작~, 외국영화, 옵티머스 프라임)" };

		Random rand2 = new Random();

		System.out.println("------------------------------------------------");
		System.out.println(questions[1]);
		System.out.println(action[rand2.nextInt(7)]);
		System.out.println();

		while (true) {
			System.out.print("정답 입력>>");
			String title2 = this.sc.nextLine();
			cnt += 1;
			cnt2 -= 1;

			switch (title2) {

			case "존윅":
				if (title2.equals(action[0]))
					System.out.println("존윅 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "메이즈 러너":
				if (title2.equals(action[1]))
					System.out.println("메이즈 러너 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "아저씨":
				if (title2.equals(action[2]))
					System.out.println("아저씨 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "범죄도시":
				if (title2.equals(action[3]))
					System.out.println("범죄도시 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "베테랑":
				if (title2.equals(action[4]))
					System.out.println("베테랑 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "뺑반":
				if (title2.equals(action[5]))
					System.out.println("뺑반 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "트랜스포머":
				if (title2.equals(action[6]))
					System.out.println("트랜스포머 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			default:
				System.out.println();
				System.out.println("기회가" + cnt2 + "번 남았습니다.");
				isCorrect = false;
				if (cnt2 == 0) {
					isCorrect = true;
				}
				break;
			}
			if (isCorrect)
				break;
		}
		if (cnt2 != 0) {
			System.out.println(cnt + " 번만에 성공하셨습니다.\n");
			System.out.println("스코어 1점을 획득합니다.");
			System.out.println("영화 제목 맞히기 게임을 종료합니다.");
			System.out.println("메인화면으로 돌아갑니다.");
			System.out.println();
		} else {
			System.out.println();
			System.out.println();
			System.out.println("풉! 점수 획득에 실패했습니다.");
			System.out.println("영화 제목 맞히기 게임을 종료합니다.");
			System.out.println("메인화면으로 돌아갑니다.");
			System.out.println();
		}
	}

	public void showMov3() {

		boolean isCorrect = false;
		int cnt = 0;
		int cnt2 = 0;

		// 가위바위보 실행
		System.out.println("난이도 조절을 위해 가위바위보 게임을 진행합니다!");
		System.out.println("이기면 6번의  기회가, 비기면 4번, 지면 2번의 기회가 주어집니다.");
		RockGame newStart = new RockGame();
		cnt2 = newStart.rockGame();

		// 질문
		String[] questions = { "다음 초성에 맞는 공포영화는?", "다음 초성에 맞는 액션영화는?", "다음 초성에 맞는 애니메이션은?" };

		// 애니메이션 : "이웃집 토토로", "짱구는 못말려", "하울의 움직이는 성", "귀멸의 칼날 무한열차", "모아나", "겨울왕국",
		// "원령공주"
		String[] anime = { "ㅇㅇㅈ ㅌㅌㄹ"+"\n"+"(hint: 1988년작, 미야자키 하야오, 거대토끼)", 
				"ㅉㄱㄴ ㅁㅁㄹ"+"\n"+"(hint: 1992년작~, 흰둥이, 천방지축 얼렁뚱땅)", 
				"ㅎㅇㅇ ㅇㅈㅇㄴ ㅅ"+"\n"+"(hint: 2004년작, 지브리, 소피는 할머니)", 
				"ㄱㅁㅇ ㅋㄴ ㅁㅎㅇㅊ"+"\n"+"(hint: 2021년작, 극장판, 번개의 호흡 제 1의형 벽력일섬!)", 
				"ㅁㅇㄴ"+"\n"+"(hint: 2017년작, 디즈니, How Far I'll Go)", 
				"ㄱㅇㅇㄱ"+"\n"+"(hint: 2014년작~, 디즈니, Let It Go)", 
				"ㅇㄹㄱㅈ" +"\n"+"(hint: 1997년작~, 미야자키 하야오, 늑대소녀)"};

		Random rand2 = new Random();

		System.out.println("------------------------------------------------");
		System.out.println(questions[2]);
		System.out.println(anime[rand2.nextInt(7)]);
		System.out.println();

		// 애니메이션
		while (true) {
			System.out.print("정답 입력>>");
			String title3 = this.sc.nextLine();
			cnt += 1;
			cnt2 -= 1;

			switch (title3) {

			case "이웃집 토토로":
				if (title3.equals(anime[0]))
					System.out.println("이웃집 토토로 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "짱구는 못말려":
				if (title3.equals(anime[1]))
					System.out.println("짱구는 못말려 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "하울의 움직이는 성":
				if (title3.equals(anime[2]))
					System.out.println("하울의 움직이는 성 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "귀멸의 칼날 무한열차":
				if (title3.equals(anime[3]))
					System.out.println("귀멸의 칼날 무한열차 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "모아나":
				if (title3.equals(anime[4]))
					System.out.println("모아나 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "겨울왕국":
				if (title3.equals(anime[5]))
					System.out.println("겨울왕국 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			case "원령공주":
				if (title3.equals(anime[6]))
					System.out.println("원령공주 정답입니다.");
				scoreOfA += 1;
				isCorrect = true;
				break;

			default:
				System.out.println();
				System.out.println("기회가" + cnt2 + "번 남았습니다.");
				isCorrect = false;
				if (cnt2 == 0) {
					isCorrect = true;
				}
				break;
			}
			if (isCorrect)
				break;
		}
		if (cnt2 != 0) {
			System.out.println(cnt + " 번만에 성공하셨습니다.\n");
			System.out.println("스코어 1점을 획득합니다.");
			System.out.println("영화 제목 맞히기 게임을 종료합니다.");
			System.out.println("메인화면으로 돌아갑니다.");
			System.out.println();
		} else {
			System.out.println();
			System.out.println();
			System.out.println("풉! 점수 획득에 실패했습니다.");
			System.out.println("영화 제목 맞히기 게임을 종료합니다.");
			System.out.println("메인화면으로 돌아갑니다.");
			System.out.println();
		}
	}

}

//메소드 제거
//	public void more() {
//		System.out.println("영화 제목 맞추기 게임을 종료합니다.");
//		System.out.println("메인화면으로 돌아갑니다.");
//		System.out.println();
//		MovieGame.finish = true; 
//	}