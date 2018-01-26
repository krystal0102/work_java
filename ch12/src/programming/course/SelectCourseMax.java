package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectCourseMax {
	public static void main(String[] args) {

		try {
			String url = "jdbc:mysql://localhost:3306";	
			String dbName = "univ";

			// 1. 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");

			// 2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(url + "/" + dbName, "root", "koitt");

			// 3. SQL문 작성
			String sql = "SELECT * FROM course WHERE maxnum >= 80";

			// 4. SQL실행 위한 객체 생성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
			// SELECT문이니까 executeQuery(); 리턴타입은 ResultSet
			// 5. 질의 결과 처리
			ResultSet rs = pstmt.executeQuery();
			System.out.printf("%s\t%s\t\t%s\t%s\n","id", "name", "professor", "maxnum");
			while (rs.next()) {
				System.out.printf("%s\t%s\t%s\t\t%s\n", rs.getInt("id"), rs.getString("name"), rs.getString("professor"), rs.getInt("maxnum"));
			}											// getString(1) 이 아니라 필드명을 입력 가능. 직관적~
			
			// 6. 객체 연결 해제 -> 항상 역순
			rs.close();
			pstmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
