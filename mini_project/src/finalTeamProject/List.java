package finalTeamProject;
import finalTeamProject.*;

public class List {
	
	//list는 단어로 나올 후보들 , 얘네중 하나를 랜덤으로 골라서 pickword에 저장
	String [] list = { "love","orange","computer","pencil","fish","flower","music","water","grape","monkey"};
	String pickWord =  list[(int)(Math.random()*10)];
	
	
	//repeat함수가 구버전에서는 안돼서 같은 기능으로 만든것(복사해옴) : 글자수만큼 ?를 출력
	String question(int leng) {
		String repeat = new String(new char[leng]).replace("\0", "?");
		return repeat;
	}
	
//	//알파벳이 문자열 안에 있는지 확인하고 숫자를 센다 같은 알파벳이 두번이상나오면 쓰려고 만들었는ㄷㅔ 구현을 못했다
//	int count(String str,String ch) {
//		int num =0;
//		for (int i=0;i<str.length();i++){
//			if(str.contains(ch)) {
//				str = str.replaceFirst(ch, "*");
//				num = num + 1;
//			}
//		}
//		return num;
//	}

}