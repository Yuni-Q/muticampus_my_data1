import java.util.Scanner;

public class T03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ű�� �Է��Ͻÿ�: ");
		double height = scan.nextDouble();
		System.out.println("�����Ը� �Է��Ͻÿ�");
		double weight = scan.nextDouble();
		double averageWeight = (height - 100) * 0.9;
		if (weight > averageWeight + 10) {
			System.out.println("��ü��");
		} else if (weight <= averageWeight - 10) {
			System.out.println("��ü��");
		} else {
			System.out.println("����");
		}
	}
}
