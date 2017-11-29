import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String reversal = new String();	
		System.out.println("ют╥б");
		reversal=scan.nextLine();
		for(int i=reversal.length()-1;i>=0;i--){
			System.out.print(reversal.charAt(i));
			}
			
		}
}
