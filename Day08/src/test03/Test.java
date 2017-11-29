package test03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Movie myMovie = new Movie();
				
		System.out.println("제목");
		myMovie.setTitle(scan.nextLine());
		System.out.println("평점");
		myMovie.setPoint(scan.nextDouble());
		System.out.println("년도");
		myMovie.setYear(scan.nextInt());
		System.out.println("감독");
		myMovie.setBoss(scan.next());
		
	
		System.out.println(myMovie.getTitle());
		System.out.println(myMovie.getPoint());
		System.out.println(myMovie.getBoss());
		System.out.println(myMovie.getYear());
		
		
	}
}
