package test06;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// Student s1 = new Student("������", 20, 4.5);
		// Student s2 = new Student("ȫ�浿", 21, 4.0);
		//
		// System.out.println(s1.compareTo(s2));
		//
		//

		Student[] student = new Student[4];

		student[0] = new Student("���ڹ�", 20, 3.5);
		student[1] = new Student("������", 21, 3.7);
		student[2] = new Student("������", 20, 4.5);
		student[3] = new Student("ȫ�浿", 21, 4.0);

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}

		Arrays.sort(student);

		System.out.println("---------------------");

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}

	}

}
