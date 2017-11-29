package test04;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBTest {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;

		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			// 2. 커넥션 생성
			String DB_URL = "jdbc:mysql://70.12.111.137:3306/java";
			String DB_ID = "root";
			String DB_PW = "sds1103";

			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			// 3. SQL 작성
			
			

			sql = "select book_num,title,publisher,year,price from books";
			// sql = "update books set price=25000";
			// 4. Statement 또는 PreparedStatement
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			 List<BookVO> bookList = new ArrayList<>();
			
			while(rs.next()){
				BookVO book = new BookVO();
				book.setBookNum(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setYear(rs.getString(4));
				book.setPrice(rs.getShort(5));
				
				bookList.add(book);
				
			}
			for(BookVO b : bookList){
				System.out.println(b);
			}
			
			
			

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
