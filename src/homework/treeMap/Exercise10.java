package homework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Exercise10 {
	 private Map<String, Integer> wordFrequencyMap = new TreeMap<>();;

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

	        // Update word frequencies
	        wordFrequency.updateWordFrequency(text);

	        // Find and print the most frequent word
	        String mostFrequentWord = wordFrequency.findMostFrequentWord();

	        if (mostFrequentWord != null) {
	            System.out.println("Most frequent word: " + mostFrequentWord);
	        } else {
	            System.out.println("No words found.");
	        }
	    }
}
