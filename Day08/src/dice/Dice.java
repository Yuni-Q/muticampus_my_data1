package dice;

public class Dice {
	int face = 0;

	public int roll() {
		face = (int) (Math.random() * 6 + 1);
		return face;
	}
}
