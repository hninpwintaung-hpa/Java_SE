package homework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	Map<String, String> wordMap = new HashMap<>();

	public static void main(String[] args) {

		Dictionary dictionary = new Dictionary();

		dictionary.addWordAndMeaning("apple", "a fruit that grows on trees");
		dictionary.addWordAndMeaning("book", "a written or printed work consisting of pages");
		dictionary.addWordAndMeaning("computer", "an electronic device for processing data");

		String wordMeaning = dictionary.getMeaning("book");
		System.out.println(wordMeaning);
	}

	public void addWordAndMeaning(String word, String meaning) {
		wordMap.put(word, meaning);
	}

	public String getMeaning(String word) {
		return wordMap.get(word);
	}
}
