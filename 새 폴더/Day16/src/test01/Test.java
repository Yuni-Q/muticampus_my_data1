package test01;

import java.util.List;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int select;

		// Ű����� �Է¹��� å���� ���� ����
		String title, pub, year;
		int price, bookNum;

		// DB �۾� ����� dao ��ü ����
		BookDao dao = new BookDao();

		while (true) {
			System.out.println("1:å�߰� 2:å���� 3:å���� 4:å��ȣ�� �˻� 5:��ü���� -1:����");
			select = sc.nextInt();

			if (select == -1) {
				break;
			}
			switch (select) {
			case 1:// å �߰� �۾�
				sc.nextLine();
				System.out.println("����>");
				title = sc.nextLine();
				System.out.println("���ǻ�>");
				pub = sc.nextLine();
				System.out.println("����>");
				price = sc.nextInt();
				System.out.println("�⵵>");
				year = sc.next();

				BookVO book = new BookVO(0, title, pub, price, year);
				System.out.println(book);
				System.out.println("�߰����:" + dao.insert(book)); // DB�� å �߰�
				break;
			case 2:// å ���� ����
			case 3:// å ���� ���
				sc.nextLine();
				System.out.println("������ å ��ȣ>");
				bookNum = sc.nextInt();
				System.out.println("�������: " + dao.delete(bookNum));
			case 4:
				System.out.println("�˻��� å ��ȣ>");
				bookNum = sc.nextInt();
				book = dao.selctone(bookNum);// DB���� å ��ȸ
				if (book == null) {
					System.out.println("�߸��� å ��ȣ �Դϴ�.");

				} else {
					System.out.println(book);
				}
			case 5:// ��ü����
				List<BookVO> bookList = dao.selectAll();
				if (bookList.size() == 0) {
					System.out.println("books ���̺� å�� ����");
				} else {
					System.out.println("��ü å ���");
					for (BookVO b : bookList) {
						System.out.println(b);
					}
					System.out.println("��");
				}
				break;
			}

		}

	}
}
