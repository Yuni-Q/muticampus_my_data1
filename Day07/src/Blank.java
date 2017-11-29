import java.util.Scanner;

public class Blank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String blank1 = new String();
		String blank2 = new String();
		int num=0;
		
		System.out.println("입력");
		blank1=scan.nextLine();
		blank2=blank1.trim();
		System.out.println(blank2);
		
	    for(int i = 0 ; i < blank2.length() ; i++)
		    {
		        if(blank2.charAt(i) == ' ')
		            num+=1;
		    }
		    
		


		//출처: http://shstarkr.tistory.com/185 [아마그래머]
		System.out.println(num+1);
	}
}
