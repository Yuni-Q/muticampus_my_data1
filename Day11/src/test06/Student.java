package test06;

public class Student implements Comparable<Student> {

	private String name;
	private int age;
	private double grade;

	/////////////////////////////////////////////////////////////////
	public Student(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸�:" + name + "����:" + age + "����:" + grade;
	}

	@Override
	public int compareTo(Student other) {
		if (this.grade > other.grade) {
			return 1;
			// ���� ��ü�� ������ �� ���� ���
		} else if (this.grade < other.grade) {
			return -1;
			// ���� ��ü�� ������ �� ���� ���
		} else {
			return 0;
			// ���� ��ü�� ���޹��� �ٸ� �л���ü�� ������ ���� ���
		}

	}

}
