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
			System.out.println("1:å�߰� 2:å���� 3:å���� 4:å��ȣ�� �˻� -1:����");
			select = sc.nextInt();
			
			if( select==-1){
				break;
			}
			switch(select){
			case 1:
				System.out.println("����");
				title = sc.next();
				System.out.println("����");
				supervision = sc.next();
				System.out.println("�⵵>");
				year = sc.next();
				System.out.println("����>");
				price = sc.nextInt();

				MovieVO movie = new MovieVO(0, title, supervision, year, price);
				System.out.println(movie);
				System.out.println("�߰����:" + dao.insert(movie)); // DB�� å �߰�
				break;
			case 2:// å ���� ����
			case 3:// å ���� ���
				sc.nextLine();
				System.out.println("������ å ��ȣ>");
				movieNum = sc.nextInt();
				System.out.println("�������: " + dao.delete(movieNum));
			case 4:
				System.out.println("�˻��� å ��ȣ>");
				movieNum = sc.nextInt();
				movie = dao.selectone(movieNum);// DB���� å ��ȸ
				if (movie == null) {
					System.out.println("�߸��� å ��ȣ �Դϴ�.");

				} else {
					System.out.println(movie);
				}
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
