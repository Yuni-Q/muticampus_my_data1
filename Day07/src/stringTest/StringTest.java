import java.util.Scanner;
import java.util.regex.Pattern;
 
 
public class StringTest {
 public static void main (String[] args) {
  
  String s;
  Scanner input = new Scanner(System.in);
  
  System.out.print("��ǰ ��ȣ�� �Է��Ͻÿ�: ");
  s = input.next(); // ��ǰ��ȣ �Է¹���
 
  if (s.length() == 6) {
   boolean code = Pattern.matches("^[A-Z]{2}[0-9]{4}", s);
   if (code == true) {
    System.out.printf("�ùٸ� ��ǰ ��ȣ�Դϴ�.");
   }
   else {
    System.out.printf("�߸��� ��ǰ ��ȣ�Դϴ�.");
   }
  }
  else {
   System.out.printf("�߸��� ��ǰ ��ȣ�Դϴ�.");
  }
 }
}