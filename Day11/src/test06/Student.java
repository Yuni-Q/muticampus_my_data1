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
		return "이름:" + name + "나이:" + age + "학점:" + grade;
	}

	@Override
	public int compareTo(Student other) {
		if (this.grade > other.grade) {
			return 1;
			// 현재 객체의 학점이 더 높은 경우
		} else if (this.grade < other.grade) {
			return -1;
			// 현재 객체의 학점이 더 낮은 경우
		} else {
			return 0;
			// 현재 객체와 전달받은 다른 학생객체의 점수가 같은 경우
		}

	}

}
