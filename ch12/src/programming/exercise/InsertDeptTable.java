package programming.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDeptTable {
	private static PreparedStatement prepareStatement;

	public static void main(String[] args) {
		try {

			String url = "jdbc:mysql://localhost:3306";	
			String dbName = "univ";
			
			// 1. 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");

			// 2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(url + "/" + dbName, "root", "koitt");
			
			// 3. SQL문 작성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO department VALUES (?, ?, ?)");
			
			// 4. SQL실행 위한 객체 생성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
			// 5. 데이터 입력
			pstmt.setInt(1, 1);						// 첫번째 인자는 ?가 몇번째인지, 두번째 인자는 값
			pstmt.setString(2, "경영학과");
			pstmt.setInt(3, 120);
			int result = pstmt.executeUpdate();		// 6. SQL문 실행
			System.out.println(result);
			
			pstmt.setInt(1, 2);
			pstmt.setString(2, "컴퓨터공학과");
			pstmt.setInt(3, 60);
			result = pstmt.executeUpdate();
			System.out.println(result);
			
			pstmt.setInt(1, 3);
			pstmt.setString(2, "기계공학과");
			pstmt.setInt(3, 60);
			result = pstmt.executeUpdate();
			System.out.println(result);
			
			pstmt.setInt(1, 4);
			pstmt.setString(2, "전자공학과");
			pstmt.setInt(3, 80);
			result = pstmt.executeUpdate();
			System.out.println(result);
			
			pstmt.setInt(1, 5);
			pstmt.setString(2, "국어국문학과");
			pstmt.setInt(3, 40);
			result = pstmt.executeUpdate();
			System.out.println(result);
			
			pstmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
