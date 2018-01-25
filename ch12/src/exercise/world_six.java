package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class world_six {
	public static void main(String[] args) {

		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "world_0";
		String dbURL = "jdbc:mySql://localhost:3306/" + dbName;

		try {

			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			Statement stmt = con.createStatement();
			
			String six = "SELECT * FROM city WHERE pop > 3000000;";
			ResultSet result6 = stmt.executeQuery(six); 
			
			System.out.println("---- 인구 300만명 넘는 도시 조회 ----");
			while (result6.next()) {
				System.out.print(result6.getString(1) + "\t");
				System.out.print(result6.getString(2) + "\t");
				System.out.print(result6.getString(3) + "\t");	     
				System.out.println(result6.getInt(4));
			}
			
			System.out.println();
			
			String seven = "SELECT name, major FROM city WHERE pop < 3000000;";
			ResultSet result7 = stmt.executeQuery(seven);
			
			System.out.println("---- 인구 300만명 미만인 도시의 시장 ----");
			while (result7.next()) {
				System.out.print("  " + result7.getString(2) + "\t");
				System.out.println("  " + result7.getString(3) + "\t");
			}
			
			result7.close();
			result6.close();
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
