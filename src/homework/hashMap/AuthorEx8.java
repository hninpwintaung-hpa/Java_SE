package homework.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorEx8 {
	Map<String, String> bookAuthorMap = new HashMap<>();

	public void addBookAndAuthor(String bookTitle, String author) {
		bookAuthorMap.put(bookTitle, author);
	}

	public static void main(String[] args) {
		AuthorEx8 bookAuthor = new AuthorEx8();

		bookAuthor.addBookAndAuthor("The Great Gatsby", "F. Scott Fitzgerald");
		bookAuthor.addBookAndAuthor("To Kill a Mockingbird", "Harper Lee");
		bookAuthor.addBookAndAuthor("1984", "George Orwell");
		bookAuthor.addBookAndAuthor("Pride and Prejudice", "Jane Austen");
		bookAuthor.addBookAndAuthor("The Catcher in the Rye", "J.D. Salinger");

		String authorToFind = "Harper Lee";
		List<String> booksByAuthor = bookAuthor.findBooksByAuthor(authorToFind);

		System.out.println("Books by author " + authorToFind + ":");
		for (String book : booksByAuthor) {
			System.out.println(book);
		}

	}

	public List<String> findBooksByAuthor(String author) {
		List<String> booksByAuthor = new ArrayList<>();
		for (Map.Entry<String, String> entry : bookAuthorMap.entrySet()) {
			if (entry.getValue().equalsIgnoreCase(author)) {
				booksByAuthor.add(entry.getKey());
			}
		}
		return booksByAuthor;
	}
}
