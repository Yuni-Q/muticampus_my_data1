package movie;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int select;

		String title, supervision, year;
		int movieNum, price;

		MovieDao dao = new MovieDao();
		
		while(true){
			System.out.println("1:책추가 2:책수정 3:책삭제 4:책번호로 검색 -1:종료");
			select = sc.nextInt();
			
			if( select==-1){
				break;
			}
			switch(select){
			case 1:
				System.out.println("제목");
				title = sc.next();
				System.out.println("감독");
				supervision = sc.next();
				System.out.println("년도>");
				year = sc.next();
				System.out.println("가격>");
				price = sc.nextInt();

				MovieVO movie = new MovieVO(0, title, supervision, year, price);
				System.out.println(movie);
				System.out.println("추가결과:" + dao.insert(movie)); // DB에 책 추가
				break;
			case 2:// 책 정보 수정
			case 3:// 책 삭제 잡업
				sc.nextLine();
				System.out.println("삭제할 책 번호>");
				movieNum = sc.nextInt();
				System.out.println("삭제결과: " + dao.delete(movieNum));
			case 4:
				System.out.println("검색할 책 번호>");
				movieNum = sc.nextInt();
				movie = dao.selectone(movieNum);// DB에서 책 조회
				if (movie == null) {
					System.out.println("잘못된 책 번호 입니다.");

				} else {
					System.out.println(movie);
				}
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
