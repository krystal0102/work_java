package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String DBName = "myjavadb";
			String dbURL = "jdbc:mySql://localhost:3306/" + DBName;
							// +"?useUnicode=true&characterEncoding=euckr";
			
			String sqlCT = "create table student (" +
							"id			varchar(20)			NOT NULL, "+
							"name		varchar(20)			NOT NULL, "+
							"snum		int					NOT NULL, "+
							"dept		varchar(20)			NOT NULL, "+
							"PRIMARY KEY ( id )" +
							");" ;
			
			// JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 질의를 할 Statement 만들기
			Statement stmt = con.createStatement();	
			// 데이터베이스 myjavadb 에 테이블 student만들기
			stmt.executeUpdate(sqlCT);
			System.out.println("테이블 student가 생성되었습니다.");
			
			// 데이터베이스 myjavadb의 테이블 student에 레코드 삽입
			stmt.executeUpdate("insert into student values ('01', '홍길동', 20125678, '전산과학과');");
			stmt.executeUpdate("insert into student values ('02', '김제동', 20121234, '미생물학과');");
			stmt.executeUpdate("insert into student values ('03', '김지숙', 20137982, '고고학과');");
			System.out.println("테이블 student에 3개의 레코드가 삽입되었습니다.");
			
			stmt.close();
			con.close();
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("MySql 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
