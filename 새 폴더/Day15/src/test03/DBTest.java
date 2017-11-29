package test03;

import java.sql.*;

public class DBTest {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String ur1 = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds1103";
			con = DriverManager.getConnection(ur1, id, pw);

			String sql = "select * from books where book_num=80";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int bookNum = rs.getInt(1);
				String title = rs.getString(2);
				String pub = rs.getString(3);
				int price = rs.getInt(4);
				String year = rs.getString(5);
				
				System.out.println(bookNum+"/"+title+"/"+pub+"/"+price+"/"+year);

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 오류 !!");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
