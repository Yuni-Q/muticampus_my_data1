package person;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Person[] p = new Person[3];
		p[0]= new Person("���ڹ�",170);
		p[1]= new Person("�达��",160);
		p[2]= new Person("������",180);
		
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].toString());
		}

		Arrays.sort(p);

		System.out.println("---------------------");

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].toString());
		}
		String result = Person.getMaximum(p);
		System.out.println(result);
	}

}
