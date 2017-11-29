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
			// 1. ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			// 2. Ŀ�ؼ� ����
			String DB_URL = "jdbc:mysql://70.12.111.130:3306/java";
			String DB_ID = "root";
			String DB_PW = "sds1103";

			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			// 3. SQL �ۼ�
			sql = "insert into books(year,price,title,publisher,book_num)"
					+ "values('0531',1350,'go to home','sds',9999)";
			//sql = "update books set price=25000";
			// 4. Statement �Ǵ� PreparedStatement
			stmt = con.createStatement();
			// 5. SQL ����
			// 5.1 ��ɾ� insert, update, delete �� ���
			int result = stmt.executeUpdate(sql);
			// 5.2 ����� select �� ���
			// 6 ����� ó��
			System.out.println("SQL ���� ���"+result);

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
