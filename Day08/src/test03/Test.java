package test03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Movie myMovie = new Movie();
				
		System.out.println("����");
		myMovie.setTitle(scan.nextLine());
		System.out.println("����");
		myMovie.setPoint(scan.nextDouble());
		System.out.println("�⵵");
		myMovie.setYear(scan.nextInt());
		System.out.println("����");
		myMovie.setBoss(scan.next());
		
	
		System.out.println(myMovie.getTitle());
		System.out.println(myMovie.getPoint());
		System.out.println(myMovie.getBoss());
		System.out.println(myMovie.getYear());
		
		
	}
}
