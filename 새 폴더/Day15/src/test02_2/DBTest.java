package test02_2;

import java.sql.*;
import java.util.Scanner;


public class DBTest {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			// 2. 커넥션 생성
			String DB_URL = "jdbc:mysql://70.12.111.137:3306/java";
			String DB_ID = "root";
			String DB_PW = "sds1103";

			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			// 3. SQL 작성
			Scanner sc = new Scanner(System.in);
			System.out.println("제목>");
			String title = sc.next();
			System.out.println("출판사>");
			String publisher = sc.next();
			System.out.println("년도>");
			String year = sc.next();
			System.out.println("가격>");
			int price = sc.nextInt();
			System.out.println("넘버>");
			int num = sc.nextInt();
			

			sql = "insert into books(year,price,title,publisher,book_num)" + "values (?,?,?,?,?)";
			// sql = "update books set price=25000";
			// 4. Statement 또는 PreparedStatement
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, year);
			pstmt.setInt(2, price);
			pstmt.setString(3, title);
			pstmt.setString(4, publisher);
			pstmt.setInt(5, num);

			// 5. SQL 실행
			// 5.1 명령어 insert, update, delete 인 경우
			int result = pstmt.executeUpdate();
			// 5.2 명령이 select 인 경우
			// 6 결과값 처리
			System.out.println("SQL 실행 결과" + result);

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
