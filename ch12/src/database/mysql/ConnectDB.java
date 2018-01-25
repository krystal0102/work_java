package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	public static void main(String[] args) {

		try {
			// JDBC드라이버의 이름을 지정. 공식사이트에서 권장하는 이름임
			String driverName = "com.mysql.jdbc.Driver";
			

			// JDBC드라이버 로드. 
			// forName() : 프로그램 구동중에 클래스 정보를 가져올때 사용
			Class.forName(driverName);		

			// 접속할 정보인 URL 지정. DB에 접속하지 않고 테스트만 해볼때
			String dbURL = "jdbc:mySql://localhost:3306";

			// 데이터베이스에 연결
			// getConnection(String url, String user, String password)
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			System.out.println("MySql 데이터베이스에 성공적으로 접속했습니다.");
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("MyAql 데이터베이스 접속에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
