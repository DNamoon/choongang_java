package project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class User {
	int unum ;
	String uname;
	String phone;
	String password;
	User(int unum, String uname, String phone, String password) {
		this.unum = unum;
		this.uname = uname;
		this.phone = phone;
		this.password = password;		
		System.out.println(uname+" �� ��� �Ϸ�!");
	}
	@Override
	public String toString () {
		String ss = "(�����ѹ� : " + unum + ", �̸�: " + uname + ", �޴�����ȣ: " + phone + ", ��ȣ : " + password + ")";
		return ss;
	}
	

}
