package junit5.assertions.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.ibs.bookstore.model.Book;
import com.ibs.bookstore.service.BookService;

public class AssertArrayEqualsDemo {

	@Test
	public void assertArrayEqualsWithNoMessage() {
		BookService bookService = new BookService();

		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		Book thirdBook = new Book("3", "Head First Javascript", "packet");

		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		bookService.addBook(thirdBook);

		String[] actualBookIds = bookService.getBookIdByPublisher("Wrox");

		assertArrayEquals(new String[] { "1", "2" }, actualBookIds);
	}

	@Test
	public void assertArrayEqualsWithMessage() {
		BookService bookService = new BookService();

		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		Book thirdBook = new Book("3", "Head First Javascript", "packet");

		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		bookService.addBook(thirdBook);
		String[] actualBookIds = bookService.getBookIdByPublisher("Wrox");

		assertArrayEquals(new String[] { "1", "2" }, actualBookIds, "bookIds didnt match !");
	}

	@Test
	public void assertArrayEqualsWithMessageSupplier() {
		BookService bookService = new BookService();

		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		Book thirdBook = new Book("3", "Head First Javascript", "packet");

		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		bookService.addBook(thirdBook);
		String[] actualBookIds = bookService.getBookIdByPublisher("Wrox");

		assertArrayEquals(new String[] { "1", "2" }, actualBookIds, () -> "bookIds didnt match !");
	}

}
