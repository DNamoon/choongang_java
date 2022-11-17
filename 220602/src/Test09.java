import java.util.*;
public class Test09 {
	public static void main(String[] args) {
		//String[] animal = {"사자", "호랑이", "토끼", "여우", "개", "소"};
		//int idx = -1;
		//String find = "여우";
		
		//System.out.println(find + "는" + idx + "인덱스");
		//String 배열 갯수 받고 입력하고 검색할거 받자. 그 다음에 검색할거 찾는거 해보자.
		System.out.print("몇 마리 입력할거야? >>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String[] animals = new String[a];
		scanner.nextLine(); // 내가한거랑 비교했을 때 이것만 강사님 추가
		
		for(int i=0;i<animals.length;i++) {
			System.out.print("동물입력>");
			String animal = scanner.nextLine(); // 나 scanner.next(); 로 했는데 강사님 scanner.nextLine();
			animals[i] = animal;
		}
		System.out.print("찾고 싶은 동물이 있나요? >>>");
		
		String find = scanner.nextLine();
		
		System.out.println(find);
		
		for(int i=0;i<animals.length;i++) {
			if(find.equals(animals[i]))  {
				System.out.println("찾고 있는 " + find + "는 " + i +" 번째 인덱스에 위치하고 있어요.");
//			} else {
//				System.out.println("찾고 있는 동물은 이곳에 없어요.");
//				//break;
			}
		}
		System.out.print("이곳에는 ");
		
		for(int i=0;i<animals.length;i++) {
			System.out.print(animals[i]+"/");
		}
		System.out.println("등의 동물들이 있습니다.");
		
//		if(animals.equals(find)) {
//			System.out.println(find + ", 동물을 구경해요!");
//		} else {
//			System.out.println("찾고 있는 동물은 이곳에 없어요.");
//		}
	
	
		//System.out.println(animals[i]);
		
//		for(int i=0; i<animal.length;i++) {
//			if(animal[i] == find) {
//				idx = i;
//				System.out.println(find + "는 "+"["+idx+ "]"+ "번째 인덱스");
//			}
//		}	
	}
}
