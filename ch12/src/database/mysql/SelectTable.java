package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTable {
	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String dbName = "myjavadb";
			String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
			String sql = "select * FROM student;";
	
			//JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			//질의를 할 Statement 만들기
			Statement stmt = con.createStatement();

			//데이터베이스 myjavadb의 테이블 student에 레코드 조회
			ResultSet result = stmt.executeQuery(sql);
			System.out.println("--------- 테이블 student 내용 조회 ---------");
			while (result.next()) {
				System.out.print(result.getString(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getInt(3) + "\t");	     
				System.out.println(result.getString(4));
			}
			
			result.close();
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("MySql 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
