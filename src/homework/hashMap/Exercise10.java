package homework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Exercise10 {
	private Map<String, Integer> wordFrequencyMap = new HashMap<>();

	public void updateWordFrequency(String text) {
		String[] words = text.toLowerCase().split("\\s+");

		for (String word : words) {
			word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
			if (!word.isEmpty()) {
				wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
			}
		}
	}

	public String findMostFrequentWord() {
		String mostFrequentWord = null;
		int maxFrequency = 0;

		for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
			if (entry.getValue() > maxFrequency) {
				maxFrequency = entry.getValue();
				mostFrequentWord = entry.getKey();
			}
		}

		return mostFrequentWord;
	}

	public static void main(String[] args) {
		Exercise10 wordFrequency = new Exercise10();
		String text = "This is a sample text. Text processing is important for natural language processing.";

		wordFrequency.updateWordFrequency(text);

		String mostFrequentWord = wordFrequency.findMostFrequentWord();

		System.out.println("Most frequent word: " + mostFrequentWord);

	}

}
