import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] hexa2bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		char[] charToBin = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

		System.out.print("숫자를 입력하시오.:");
		String num = scan.nextLine();
		char[] a = new char[num.length()];
		for (int i = 0; i < num.length(); i++) {
			a[i] = num.charAt(i);
			for(int j=0; j<16; j++){
				if(a[i] == charToBin[j]){
					a[i] = (char)j;
				}
					
			}
//			if (a[i] == 'a') {
//				a[i] = 10;
//
//			} else if (a[i] == 'b') {
//				a[i] = 11;
//
//			} else if (a[i] == 'c') {
//				a[i] = 12;
//
//			} else if (a[i] == 'd') {
//				a[i] = 13;
//
//			} else if (a[i] == 'e') {
//				a[i] = 14;
//
//			} else if (a[i] == 'f') {
//				a[i] = 15;
//
//			}
		}
		for (int i = 0; i < num.length(); i++) {
			System.out.print(hexa2bin[a[i]]);
			System.out.print(" ");

		}
	}

}
