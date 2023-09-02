package homework.treeMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exercise6 {

	public static void main(String[] args) {
		Map<String, String> bookAuthorMap = new TreeMap<>();
		
        bookAuthorMap.put("J.K. Rowling", "Harry Potter and the Sorcerer's Stone");
        bookAuthorMap.put("J.K. Rowling", "Harry Potter and the Chamber of Secrets");
        bookAuthorMap.put("George Orwell", "Animal Farm");
        bookAuthorMap.put("Jane Austen", "Pride and Prejudice");
        bookAuthorMap.put("Jane Austen", "Sense and Sensibility");
        bookAuthorMap.put("J.K. Rowling", "Harry Potter and the Prisoner of Azkaban");
        
        List<String> booksByAuthor = findBookByAuthor("J.K. Rowling", bookAuthorMap);
        
        for (String book : booksByAuthor) {
            System.out.println(book);
        }
	}
	
	public static List<String> findBookByAuthor(String author, Map<String, String> bookAuthorMap ) {
		List<String> bookName = new ArrayList<>();
		for(Map.Entry<String , String> map: bookAuthorMap.entrySet()) {
			bookName.add( map.getValue());
		}
		return bookName;
	}
}
