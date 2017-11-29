import java.util.Scanner;
import java.util.regex.Pattern;
 
 
public class StringTest {
 public static void main (String[] args) {
  
  String s;
  Scanner input = new Scanner(System.in);
  
  System.out.print("물품 번호를 입력하시오: ");
  s = input.next(); // 제품번호 입력받음
 
  if (s.length() == 6) {
   boolean code = Pattern.matches("^[A-Z]{2}[0-9]{4}", s);
   if (code == true) {
    System.out.printf("올바른 물품 번호입니다.");
   }
   else {
    System.out.printf("잘못된 물품 번호입니다.");
   }
  }
  else {
   System.out.printf("잘못된 물품 번호입니다.");
  }
 }
}