package test02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���α׷��� ���۵˴ϴ�.");
		int n = multi(3);// �޼ҵ� ȣ��
		System.out.println("multi(3) ���� ����� = " + n);
		n = multi(99);// �޼ҵ� ȣ��
		System.out.println("multi(99) ���� ����� = " + n);
		gugudan(5); // �޼ҵ� ȣ�� argument
		n = add(100, 5);
		System.out.println("add(100,5) ���� ����� = " + n);
		System.out.println("���α׷��� ����˴ϴ�.");

	} // main end
	///////////////////////////////////////////////////////////////////////////////////

	static int multi(int input) {
		int result = input * 2;
		return result;
	} // ���� 2�� ���ֱ�

	static int add(int a, int b) {
		int result = a + b;
		return result;
	}

	static void gugudan(int dan) {// ��ȯ�� ���� void
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "x" + i + "=" + (dan * i));
		}
	}// ������ ����
}// class Test end
