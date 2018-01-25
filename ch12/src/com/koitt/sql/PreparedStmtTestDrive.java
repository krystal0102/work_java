package com.koitt.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStmtTestDrive {

	public static void main(String[] args) {

		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "myjavadb";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;

		try {
			// 1. JDBC 드라이버 로딩
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			// 2. INSERT문
			String sql = "INSERT INTO student VALUES(?, ?, ?, ?)";
			// 형식을 미리 만들어주어 값들을 세팅할때 sql을 불러오기만 하면 됨

			// 물음표에 들어갈 값들을 세팅
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "06");
			pstmt.setString(2, "고길동");
			pstmt.setInt(3, 20131122);
			pstmt.setString(4, "컴퓨터공학과");
			pstmt.executeUpdate();

			pstmt.setString(1, "07");
			pstmt.setString(2, "둘리");
			pstmt.setInt(3, 20132277);
			pstmt.setString(4, "컴퓨터공학과");
			pstmt.executeUpdate();
			
			pstmt.close();

			// 3. SELECT문 사용
			sql = "SELECT * FROM student";
			pstmt = con.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery(sql);

			while (result.next()) {
				System.out.print(result.getString(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getInt(3) + "\t");	     
				System.out.println(result.getString(4));
			}

			// 4. 종료
			result.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
