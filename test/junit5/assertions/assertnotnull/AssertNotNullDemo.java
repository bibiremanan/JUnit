package junit5.assertions.assertnotnull;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.ibs.bookstore.model.Book;
import com.ibs.bookstore.service.BookService;

public class AssertNotNullDemo {
	@Test
	public void assertNotNullWithNoMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("4");
		assertNotNull(actualBook);
	}
	@Test
	public void assertNotNullWithMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("4");
		assertNotNull(actualBook,"Book is Null");
	}
	@Test
	public void assertNotNullWithMessageSupplier() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("1");
		assertNotNull(actualBook,()->" Book is Null");
	}
}
