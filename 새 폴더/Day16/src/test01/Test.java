package test01;

import java.util.List;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int select;

		// 키보드로 입력받을 책정보 저장 변수
		String title, pub, year;
		int price, bookNum;

		// DB 작업 담당할 dao 객체 생성
		BookDao dao = new BookDao();

		while (true) {
			System.out.println("1:책추가 2:책수정 3:책삭제 4:책번호로 검색 5:전체보기 -1:종료");
			select = sc.nextInt();

			if (select == -1) {
				break;
			}
			switch (select) {
			case 1:// 책 추가 작업
				sc.nextLine();
				System.out.println("제목>");
				title = sc.nextLine();
				System.out.println("출판사>");
				pub = sc.nextLine();
				System.out.println("가격>");
				price = sc.nextInt();
				System.out.println("년도>");
				year = sc.next();

				BookVO book = new BookVO(0, title, pub, price, year);
				System.out.println(book);
				System.out.println("추가결과:" + dao.insert(book)); // DB에 책 추가
				break;
			case 2:// 책 정보 수정
			case 3:// 책 삭제 잡업
				sc.nextLine();
				System.out.println("삭제할 책 번호>");
				bookNum = sc.nextInt();
				System.out.println("삭제결과: " + dao.delete(bookNum));
			case 4:
				System.out.println("검색할 책 번호>");
				bookNum = sc.nextInt();
				book = dao.selctone(bookNum);// DB에서 책 조회
				if (book == null) {
					System.out.println("잘못된 책 번호 입니다.");

				} else {
					System.out.println(book);
				}
			case 5:// 전체보기
				List<BookVO> bookList = dao.selectAll();
				if (bookList.size() == 0) {
					System.out.println("books 테이블에 책이 없음");
				} else {
					System.out.println("전체 책 목록");
					for (BookVO b : bookList) {
						System.out.println(b);
					}
					System.out.println("끝");
				}
				break;
			}

		}

	}
}
