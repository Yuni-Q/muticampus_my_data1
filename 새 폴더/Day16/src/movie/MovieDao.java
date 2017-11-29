package movie;

import java.sql.*;


public class MovieDao {
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private static final String DB_ID = "root";
	private static final String DB_PW = "sds1103";

	public MovieDao() {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int insert(MovieVO movie) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql = "insert into movie(title,supervision,year,price) values(?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, movie.title);
			pstmt.setString(2, movie.supervision);
			pstmt.setString(3, movie.year);
			pstmt.setInt(4, movie.price);

			result = pstmt.executeUpdate();
			System.out.println("입력!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
		}return result;
	}
	public int delete(int movieNum){
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			con =DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql = "delete from books where movieNum=?";
			
			pstmt.setInt(1, movieNum);
			
			result = pstmt.executeUpdate();
			System.out.println("완료!!");
			
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}

public MovieVO selectone(int movieNum){
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	MovieVO result = null;


		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql ="select movieNum,title,supervision,year,price where moiveNum=?";
			
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, movieNum);
			
			rs =pstmt.executeQuery();
			
			if(rs.next()){
				result= new MovieVO();
				result.setMovieNum(rs.getInt(1));
				result.setTitle(rs.getString(2));
				result.setSupervision(rs.getString(3));
				result.setYear(rs.getString(4));
				result.setPrice(rs.getInt(5));
				
			}
			
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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




























}