import java.util.*;
public class Test09 {
	public static void main(String[] args) {
		//String[] animal = {"����", "ȣ����", "�䳢", "����", "��", "��"};
		//int idx = -1;
		//String find = "����";
		
		//System.out.println(find + "��" + idx + "�ε���");
		//String �迭 ���� �ް� �Է��ϰ� �˻��Ұ� ����. �� ������ �˻��Ұ� ã�°� �غ���.
		System.out.print("�� ���� �Է��Ұž�? >>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String[] animals = new String[a];
		scanner.nextLine(); // �����ѰŶ� ������ �� �̰͸� ����� �߰�
		
		for(int i=0;i<animals.length;i++) {
			System.out.print("�����Է�>");
			String animal = scanner.nextLine(); // �� scanner.next(); �� �ߴµ� ����� scanner.nextLine();
			animals[i] = animal;
		}
		System.out.print("ã�� ���� ������ �ֳ���? >>>");
		
		String find = scanner.nextLine();
		
		System.out.println(find);
		
		for(int i=0;i<animals.length;i++) {
			if(find.equals(animals[i]))  {
				System.out.println("ã�� �ִ� " + find + "�� " + i +" ��° �ε����� ��ġ�ϰ� �־��.");
//			} else {
//				System.out.println("ã�� �ִ� ������ �̰��� �����.");
//				//break;
			}
		}
		System.out.print("�̰����� ");
		
		for(int i=0;i<animals.length;i++) {
			System.out.print(animals[i]+"/");
		}
		System.out.println("���� �������� �ֽ��ϴ�.");
		
//		if(animals.equals(find)) {
//			System.out.println(find + ", ������ �����ؿ�!");
//		} else {
//			System.out.println("ã�� �ִ� ������ �̰��� �����.");
//		}
	
	
		//System.out.println(animals[i]);
		
//		for(int i=0; i<animal.length;i++) {
//			if(animal[i] == find) {
//				idx = i;
//				System.out.println(find + "�� "+"["+idx+ "]"+ "��° �ε���");
//			}
//		}	
	}
}
