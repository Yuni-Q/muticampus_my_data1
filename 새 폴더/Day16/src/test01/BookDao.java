package test01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// book 테이블에 SQL을 전달하는 작업들을 담당하는 클래스
public class BookDao {
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private static final String DB_ID = "root";
	private static final String DB_PW = "sds1103";

	//////////////////////////////////////////////////////////////////
	public BookDao() {
		try {
			// 드라이버 로딩
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 오류. jar 파일이나 스트링 확인 요망");
			e.printStackTrace();
		}
	}

	public int insert(BookVO book) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql = "insert into books(title,publisher,price,year)" + "values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getPublisher());
			pstmt.setInt(3, book.getPrice());
			pstmt.setString(4, book.getYear());

			result = pstmt.executeUpdate();
			System.out.println("insert 결과 : " + result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
		// public int update(BookVo book){
		//
		//
		// }
	}

	public int delete(int bookNum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql = "delete from books where book_num=?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookNum);

			result = pstmt.executeUpdate();
			System.out.println("delete 결과 : " + result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;

	}

	public BookVO selctone(int bookNum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookVO result = null;

		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);

			String sql = "select book_num,title,publisher,price,year from books where book_num=?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookNum);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = new BookVO();
				result.setBookNum(rs.getInt(1));
				result.setTitle(rs.getString(2));
				result.setPublisher(rs.getString(3));
				result.setPrice(rs.getInt(4));
				result.setYear(rs.getString(5));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;

	}

	public List<BookVO> selectAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookVO result = null;
		List<BookVO> bookList = new ArrayList<>();

		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);

			String sql = "select book_num,title,publisher,price,year from books";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				result = new BookVO();
				result.setBookNum(rs.getInt(1));
				result.setTitle(rs.getString(2));
				result.setPublisher(rs.getString(3));
				result.setPrice(rs.getInt(4));
				result.setYear(rs.getString(5));
				bookList.add(result);
				

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return bookList;

	}

}
