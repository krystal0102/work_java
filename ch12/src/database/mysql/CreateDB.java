package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateDB {
	public static void main(String[] args) {
		try {
			String driveName = "com.mysql.jdbc.Driver";
			String dbURL = "jdbc:mySql://localhost:3306";

			// JDBC 드라이버 로드
			Class.forName(driveName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			// 질의를 할 Statement 만들기
			Statement stmt = con.createStatement();		// 작성한 쿼리문을 실행할 객체

			// 데이터베이스 myjavadb 만들기
			int num = stmt.executeUpdate("CREATE DATABASE myjavadb;"); // 데이터베이스 쿼리문에서 SELECT를 제외한 나머지를 사용할 때 excuteUpdate를 사용
			if (num == 1) {
				System.out.println("데이터베이스 myjavadb가 생성되었습니다.");
			}
			else {
				System.out.println("이미 생성되어 있는 데이터베이스입니다.");
			}
			
			stmt.close(); // connection 닫기 전에 statement 먼저 닫기
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC드라이버 로딩에 실패했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("MySql 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
