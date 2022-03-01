package junit5.assertions.assertIterableEquals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ibs.bookstore.model.Book;
import com.ibs.bookstore.service.BookService;

public class AssertIterableEquals {
	@Test
	public void assertArrayEqualsWithNoMessage() {
		BookService bookService = new BookService();

		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		Book thirdBook = new Book("3", "Head First Javascript", "packet");

		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		bookService.addBook(thirdBook);

		List<String> actualTitles = bookService.getBookTitlesByPublisher("Wrox");
		List<String> expected = new ArrayList<>();
		expected.add("First Book");
		expected.add("second Book");
		assertIterableEquals(expected, actualTitles);
	}

	@Test
	public void assertIterableEqualsWithMessage() {
		BookService bookService = new BookService();

		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		Book thirdBook = new Book("3", "Head First Javascript", "packet");

		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		bookService.addBook(thirdBook);
		List<String> actualTitles = bookService.getBookTitlesByPublisher("Wrox");
		List<String> expected = new ArrayList<>();
		expected.add("First Book");
		expected.add("second Book");
		assertIterableEquals(expected, actualTitles, "Titles didn't match");
	}

	@Test
	public void assertIterableEqualsWithMessageSupplier() {
		BookService bookService = new BookService();

		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		Book thirdBook = new Book("3", "Head First Javascript", "packet");

		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		bookService.addBook(thirdBook);
		List<String> actualTitles = bookService.getBookTitlesByPublisher("Wrox");
		List<String> expected = new ArrayList<>();
		expected.add("First Book");
		expected.add("second Book");
		assertIterableEquals(expected, actualTitles, () -> "Titles didn't match");
	}
}
