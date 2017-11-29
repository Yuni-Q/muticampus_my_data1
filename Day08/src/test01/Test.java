package test01;

public class Test {

	int speed; // 1번(멤버 변수,인스턴트 필드,상태변수,속성)

	public static void main(String[] args) {
		int speed; // 2번(지역변수)

	}

	int add(int a, int b) { // 3번 매계변수 - 지역변수에 포함됨
		int result = a + b; // 2번
		return result;
	}

}
