package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String sql = null;

		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			// 2. 커넥션 생성
			String DB_URL = "jdbc:mysql://70.12.111.130:3306/java";
			String DB_ID = "root";
			String DB_PW = "sds1103";

			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			// 3. SQL 작성
			sql = "insert into books(year,price,title,publisher,book_num)"
					+ "values('0531',1350,'go to home','sds',9999)";
			//sql = "update books set price=25000";
			// 4. Statement 또는 PreparedStatement
			stmt = con.createStatement();
			// 5. SQL 실행
			// 5.1 명령어 insert, update, delete 인 경우
			int result = stmt.executeUpdate(sql);
			// 5.2 명령이 select 인 경우
			// 6 결과값 처리
			System.out.println("SQL 실행 결과"+result);

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 에러 !!");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL 예외 발생, 커넥션 또는 sql 오류 !!");
			e.printStackTrace();
		} finally {
			// 7. 사용한 자원 반납 close

		}

	}

}
