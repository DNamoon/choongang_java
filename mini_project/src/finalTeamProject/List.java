package finalTeamProject;
import finalTeamProject.*;

public class List {
	
	//list�� �ܾ�� ���� �ĺ��� , ����� �ϳ��� �������� ��� pickword�� ����
	String [] list = { "love","orange","computer","pencil","fish","flower","music","water","grape","monkey"};
	String pickWord =  list[(int)(Math.random()*10)];
	
	
	//repeat�Լ��� ������������ �ȵż� ���� ������� �����(�����ؿ�) : ���ڼ���ŭ ?�� ���
	String question(int leng) {
		String repeat = new String(new char[leng]).replace("\0", "?");
		return repeat;
	}
	
//	//���ĺ��� ���ڿ� �ȿ� �ִ��� Ȯ���ϰ� ���ڸ� ���� ���� ���ĺ��� �ι��̻󳪿��� ������ ������¤��� ������ ���ߴ�
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