package test02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램이 시작됩니다.");
		int n = multi(3);// 메소드 호출
		System.out.println("multi(3) 실행 결과는 = " + n);
		n = multi(99);// 메소드 호출
		System.out.println("multi(99) 실행 결과는 = " + n);
		gugudan(5); // 메소드 호출 argument
		n = add(100, 5);
		System.out.println("add(100,5) 실행 결과는 = " + n);
		System.out.println("프로그램이 종료됩니다.");

	} // main end
	///////////////////////////////////////////////////////////////////////////////////

	static int multi(int input) {
		int result = input * 2;
		return result;
	} // 변수 2배 해주기

	static int add(int a, int b) {
		int result = a + b;
		return result;
	}

	static void gugudan(int dan) {// 반환값 없음 void
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "x" + i + "=" + (dan * i));
		}
	}// 구구단 종료
}// class Test end
