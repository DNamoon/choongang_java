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
//		rs = stat.executeQuery("select *"); //������ �ۼ�
		
//		while (rs.next()) {
//			String ss1 = rs.getString(1);
//			System.out.printf("%s", ss1);
//		}
		
		while (true) {
			System.out.println("=====�߾� ����� ���� ���� ���α׷�=====");
			System.out.println("1. ���� ���");
			System.out.println("2. ���� ���� ����");
			System.out.println("3. ���� ���� ����");
			System.out.println("4. ��ü ���� ���� ���");
			System.out.println("5. ���� ���� �˻�");
			System.out.println("6. ���α׷� ����");
			System.out.println("===================================");
			System.out.println("��ȣ �Է�>> ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			//���� ��� 
			
			if (choice == 1) {
				System.out.println("���� ����� �����մϴ�.");
				System.out.print("���� �ѹ��� �Է��ϼ���. : ");
				int unum = scan.nextInt();
				scan.nextLine();
				System.out.print("�̸��� �Է��ϼ���. : ");
				String name = scan.next();
				System.out.print("�޴�����ȣ�� �Է��ϼ���. : ");
				String phone = scan.next();
				System.out.print("��ȣ�� �Է��ϼ���. : ");
				scan.nextLine();
				String password = scan.nextLine();
				
				String sql = "INSERT INTO USER1 values( " + (unum++) + ",'"+ name + "', '" + phone + "','" + password + "')";
				stat.executeUpdate(sql);
			}
			//���� ���� ���� 
			else if(choice == 2) {
				System.out.println("���� ������ �����մϴ�.");
				System.out.print("�����Ͻ� ������ �ѹ��� �Է��ϼ��� :  ");
				int num = scan.nextInt();
//				scan.nextLine();
				System.out.println("1. �̸����� || 2. �޴�����ȣ ���� || 3. ��ȣ ����");
				System.out.print("�����Ͻ� ���뿡 �´� ��ȣ�� �Է��ϼ���. :  ");
				choice = scan.nextInt();
//				scan.nextLine();
				String work;
				if(choice == 1) {
					work = "uname";
					System.out.print("�� �̸� �Է� : ");
				}
				else if(choice == 2) {
					work = "phone";
					System.out.print("�� �޴�����ȣ �Է� : ");					
				}
				else if(choice == 3) {
					work = "password";
					System.out.print("�� ��ȣ �Է� : ");
				}
				else {
					System.out.println("�ٽ� �Է��� �ּ���.");
					continue;
				}
				scan.nextLine();
				String s = scan.nextLine();
				
				String sql = "UPDATE USER1 SET " + work + " = '" + s + "' WHERE unum = " + num;
				stat.executeUpdate(sql);
			}
			
			//���� ���� ����
			else if (choice == 3) {
				System.out.println("���� ������ �����մϴ�.");
				System.out.print("�����Ͻ� ������ �ѹ��� �Է��ϼ��� :  ");
				int num = scan.nextInt();
				
				String sql = "DELETE FROM USER1 WHERE unum =" + num;
				stat.executeUpdate(sql);
			}
			
			//��ü ���� ��� ���
			else if (choice == 4) {
				rs = stat.executeQuery("SELECT * FROM USER1");
				System.out.println("�� ������ ����մϴ�.");
				while(rs.next()) {
					System.out.print("���� �ѹ� : " + rs.getInt("unum") + " �̸� : " + rs.getString("uname") + " ��ȭ��ȣ : " + rs.getString("phone") + " ");
					System.out.println("��ȣ : "+ rs.getString("password"));
				}
				System.out.println();
				System.out.println();
			}
			
			// ���� ���� �˻�
			else if (choice == 5) {
				System.out.println("���� ������ �˻��մϴ�. ");
				System.out.println("1. �����ѹ��� �˻� || 2. �̸����� �˻� || 3. �޴�����ȣ�� �˻� ");
				System.out.print(" ��ȣ�� �Է��ϼ��� :  ");
				choice = scan.nextInt();
				String work;
				String sql;
				if (choice == 1) {
					work = "unum";
					System.out.print("���� �ѹ� �Է� : ");
					int s = scan.nextInt();
					scan.nextLine();
					sql = "SELECT * FROM USER1 WHERE " + work + " = " + s ;
				}
				else if (choice == 2) {
					work = "uname";
					System.out.print("�̸� �Է� :  ");
					scan.nextLine();
					String s = scan.next();
					sql = "SELECT * FROM USER1 WHERE " + work + " = '" + s + "' ";					
				}
				else if (choice == 3) {
					work = "phone";
					System.out.print("�޴��� ��ȣ �Է� : ");
					scan.nextLine();
					String s = scan.next();
					
					sql = "SELECT * FROM USER1 WHERE " + work + " = '" + s + "' ";
				}
				else {
					System.out.println("�ٽ� �Է��� �ּ���.");
					continue;
				}
				rs = stat.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print("��ȣ : " + rs.getInt("unum") + " �̸� : " + rs.getString("uname")+ " �޴�����ȣ : " + rs.getString("phone") + " " );
					System.out.println("��ȣ : " + rs.getString("password"));
					String uname = rs.getString("uname");
					String phone = rs.getString("phone");
				}
				
			}
			
			//���α׷� ����
			else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
//		rs.close();
//		stat.close();
//		conn.close();	
		
	}

}
