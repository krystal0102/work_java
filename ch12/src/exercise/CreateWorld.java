package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class CreateWorld {
	public static void main(String[] args) {
		try {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "world_0";
		String dbURL = "jdbc:mySql://localhost:3306/" + dbName;
		
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
		
		//Statement stmt = con.createStatement();
		
		String worldCT = "create table city (" +
						"id       int            NOT NULL     auto_increment, " +
						"name     varchar(50)    NOT NULL, " +
						"major    varchar(20)    NULL, " +
						"pop      int            NULL, " +
						"PRIMARY KEY (id)" +
						");";
		
		// stmt.executeUpdate("CREATE DATABASE world_0;");
		
		// stmt.executeUpdate(worldCT);
		
		System.out.println("city 테이블 생성완료!");
		
		String pps = "INSERT INTO city VALUES(?, ?, ?, ?)";
		
		PreparedStatement pstmt = con.prepareStatement(pps);
		
		pstmt.setString(1,"01");
		pstmt.setString(2, "서울");
		pstmt.setString(3, "이명길");
		pstmt.setInt(4, 20000000);
		pstmt.executeUpdate();
		
		pstmt.setString(1,"02");
		pstmt.setString(2, "인천");
		pstmt.setString(3, "김동훈");
		pstmt.setInt(4, 3500000);
		pstmt.executeUpdate();
		
		pstmt.setString(1,"03");
		pstmt.setString(2, "대구");
		pstmt.setString(3, "강수복");
		pstmt.setInt(4, 3000000);
		pstmt.executeUpdate();
		
		pstmt.setString(1,"04");
		pstmt.setString(2, "부산");
		pstmt.setString(3, "남기문");
		pstmt.setInt(4, 5000000);
		pstmt.executeUpdate();
		
		pstmt.setString(1,"05");
		pstmt.setString(2, "목포");
		pstmt.setString(3, "신용현");
		pstmt.setInt(4, 2000000);
		pstmt.executeUpdate();
		
		pstmt.close();
		
		pps = "SELECT * FROM city";
		pstmt = con.prepareStatement(pps);
		ResultSet result = pstmt.executeQuery(pps);
		
		while (result.next()) {
			System.out.print(result.getString(1) + "\t");
			System.out.print(result.getString(2) + "\t");
			System.out.print(result.getString(3) + "\t");	     
			System.out.println(result.getInt(4));
		}
	
		result.close();
		pstmt.close();
		con.close();
		
		//String cityInfo = "desc city;";
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
