package project2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import project2.User;

public class Fridge {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Statement stat = null;
		ResultSet rs =null;
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
		stat = conn.createStatement();
//		rs = stat.executeQuery("select *"); //쿼리문 작성
		
//		while (rs.next()) {
//			String ss1 = rs.getString(1);
//			System.out.printf("%s", ss1);
//		}
		
		while (true) {
			System.out.println("=====중앙 냉장고 유저 관리 프로그램=====");
			System.out.println("1. 유저 등록");
			System.out.println("2. 유저 정보 변경");
			System.out.println("3. 유저 정보 삭제");
			System.out.println("4. 전체 유저 정보 출력");
			System.out.println("5. 유저 정보 검색");
			System.out.println("6. 프로그램 종료");
			System.out.println("===================================");
			System.out.println("번호 입력>> ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			//유저 등록 
			
			if (choice == 1) {
				System.out.println("유저 등록을 시작합니다.");
				System.out.print("유저 넘버를 입력하세요. : ");
				int unum = scan.nextInt();
				scan.nextLine();
				System.out.print("이름을 입력하세요. : ");
				String name = scan.next();
				System.out.print("휴대폰번호를 입력하세요. : ");
				String phone = scan.next();
				System.out.print("암호를 입력하세요. : ");
				scan.nextLine();
				String password = scan.nextLine();
				
				String sql = "INSERT INTO USER1 values( " + (unum++) + ",'"+ name + "', '" + phone + "','" + password + "')";
				stat.executeUpdate(sql);
			}
			//유저 정보 변경 
			else if(choice == 2) {
				System.out.println("유저 정보를 변경합니다.");
				System.out.print("변경하실 유저의 넘버를 입력하세요 :  ");
				int num = scan.nextInt();
//				scan.nextLine();
				System.out.println("1. 이름변경 || 2. 휴대폰번호 변경 || 3. 암호 변경");
				System.out.print("변경하실 내용에 맞는 번호를 입력하세요. :  ");
				choice = scan.nextInt();
//				scan.nextLine();
				String work;
				if(choice == 1) {
					work = "uname";
					System.out.print("새 이름 입력 : ");
				}
				else if(choice == 2) {
					work = "phone";
					System.out.print("새 휴대폰번호 입력 : ");					
				}
				else if(choice == 3) {
					work = "password";
					System.out.print("새 암호 입력 : ");
				}
				else {
					System.out.println("다시 입력해 주세요.");
					continue;
				}
				scan.nextLine();
				String s = scan.nextLine();
				
				String sql = "UPDATE USER1 SET " + work + " = '" + s + "' WHERE unum = " + num;
				stat.executeUpdate(sql);
			}
			
			//유저 정보 삭제
			else if (choice == 3) {
				System.out.println("유저 정보를 삭제합니다.");
				System.out.print("삭제하실 유저의 넘버를 입력하세요 :  ");
				int num = scan.nextInt();
				
				String sql = "DELETE FROM USER1 WHERE unum =" + num;
				stat.executeUpdate(sql);
			}
			
			//전체 유저 목록 출력
			else if (choice == 4) {
				rs = stat.executeQuery("SELECT * FROM USER1");
				System.out.println("고객 정보를 출력합니다.");
				while(rs.next()) {
					System.out.print("유저 넘버 : " + rs.getInt("unum") + " 이름 : " + rs.getString("uname") + " 전화번호 : " + rs.getString("phone") + " ");
					System.out.println("암호 : "+ rs.getString("password"));
				}
				System.out.println();
				System.out.println();
			}
			
			// 유저 정보 검색
			else if (choice == 5) {
				System.out.println("유저 정보를 검색합니다. ");
				System.out.println("1. 유저넘버로 검색 || 2. 이름으로 검색 || 3. 휴대폰번호로 검색 ");
				System.out.print(" 번호를 입력하세요 :  ");
				choice = scan.nextInt();
				String work;
				String sql;
				if (choice == 1) {
					work = "unum";
					System.out.print("유저 넘버 입력 : ");
					int s = scan.nextInt();
					scan.nextLine();
					sql = "SELECT * FROM USER1 WHERE " + work + " = " + s ;
				}
				else if (choice == 2) {
					work = "uname";
					System.out.print("이름 입력 :  ");
					scan.nextLine();
					String s = scan.next();
					sql = "SELECT * FROM USER1 WHERE " + work + " = '" + s + "' ";					
				}
				else if (choice == 3) {
					work = "phone";
					System.out.print("휴대폰 번호 입력 : ");
					scan.nextLine();
					String s = scan.next();
					
					sql = "SELECT * FROM USER1 WHERE " + work + " = '" + s + "' ";
				}
				else {
					System.out.println("다시 입력해 주세요.");
					continue;
				}
				rs = stat.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print("번호 : " + rs.getInt("unum") + " 이름 : " + rs.getString("uname")+ " 휴대폰번호 : " + rs.getString("phone") + " " );
					System.out.println("암호 : " + rs.getString("password"));
					String uname = rs.getString("uname");
					String phone = rs.getString("phone");
				}
				
			}
			
			//프로그램 종료
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
//		rs.close();
//		stat.close();
//		conn.close();	
		
	}

}
