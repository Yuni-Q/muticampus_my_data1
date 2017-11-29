package person;

public class Person implements Comparable<Person> {
	private String name;
	private int height;

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	@Override
	public String toString() {
		return "ÀÌ¸§" + name + "Å°" + height;
	}

	@Override
	public int compareTo(Person other) {
		if (this.height > other.height) {
			return 1;
		} else if (this.height < other.height) {
			return -1;
		} else {
			return 0;
		}

	}
	public static String getMaximum(Person[] array){
		Person pivot = array[0];
		for(int i=0;i<array.length;i++){
			if(pivot.compareTo(array[i])<0){
				pivot = array[i];
			}
		}return pivot.name;
	}

}
