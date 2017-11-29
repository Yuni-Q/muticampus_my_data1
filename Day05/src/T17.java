
public class T17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int j = 0; j < 100; j += 10) {

			for (int i = 1; i <= 10; i++) {
				sum += i+j;
			}
					System.out.println(sum);
			sum = 0;
		}

	}

}
