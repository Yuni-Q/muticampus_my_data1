package test02_2;

import java.sql.*;
import java.util.Scanner;


public class DBTest {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			// 2. Ŀ�ؼ� ����
			String DB_URL = "jdbc:mysql://70.12.111.137:3306/java";
			String DB_ID = "root";
			String DB_PW = "sds1103";

			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			// 3. SQL �ۼ�
			Scanner sc = new Scanner(System.in);
			System.out.println("����>");
			String title = sc.next();
			System.out.println("���ǻ�>");
			String publisher = sc.next();
			System.out.println("�⵵>");
			String year = sc.next();
			System.out.println("����>");
			int price = sc.nextInt();
			System.out.println("�ѹ�>");
			int num = sc.nextInt();
			

			sql = "insert into books(year,price,title,publisher,book_num)" + "values (?,?,?,?,?)";
			// sql = "update books set price=25000";
			// 4. Statement �Ǵ� PreparedStatement
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, year);
			pstmt.setInt(2, price);
			pstmt.setString(3, title);
			pstmt.setString(4, publisher);
			pstmt.setInt(5, num);

			// 5. SQL ����
			// 5.1 ��ɾ� insert, update, delete �� ���
			int result = pstmt.executeUpdate();
			// 5.2 ����� select �� ���
			// 6 ����� ó��
			System.out.println("SQL ���� ���" + result);

		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ���� !!");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL ���� �߻�, Ŀ�ؼ� �Ǵ� sql ���� !!");
			e.printStackTrace();
		} finally {
			// 7. ����� �ڿ� �ݳ� close

		}

	}

}
