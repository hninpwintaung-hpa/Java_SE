package homework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Exercise5 {

	private Map<String, String> wordMeaningMap = new TreeMap<>();

	public void addWord(String word, String meaning) {
		wordMeaningMap.put(word, meaning);
	}

	public String getMeaning(String word) {
		return wordMeaningMap.get(word);
	}

	public static void main(String[] args) {
		Exercise5 dictionary = new Exercise5();

		dictionary.addWord("apple", "a fruit that grows on trees");
		dictionary.addWord("book", "a written or printed work consisting of pages");
		dictionary.addWord("computer", "an electronic device for processing data");
		
		String apple = dictionary.getMeaning("apple");
		String book = dictionary.getMeaning("book");
		
		System.out.println(apple);
		System.out.println(book);
	}

}
