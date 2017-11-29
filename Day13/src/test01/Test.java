package test01;

import java.util.List;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		List<String> wordList = new ArrayList<>();

		wordList.add("sleep");
		wordList.add("study");
		wordList.add("spring");
		wordList.add(1, "weather");
		wordList.add(3, "happy");

		wordList.remove(0);

		for (String word : wordList) {
			System.out.println("word: " + word);
		}

	}

}
