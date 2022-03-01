package junit5.assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.ibs.bookstore.model.Book;
import com.ibs.bookstore.service.BookService;

public class AssertEqualsDemo {
	@Test
	public void assertEqualsWithNoMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("1");
		assertEquals("1",actualBook.getBookId());
		assertEquals("First Book",actualBook.getTitle());
	}
	@Test
	public void assertEqualsWithMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("1");
		assertEquals("1",actualBook.getBookId());
		assertEquals("First Bookkk",actualBook.getTitle(),"Book title didn't match");
	}
	@Test
	public void assertEqualsWithMessageSupplier() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("1");
		assertEquals("1",actualBook.getBookId());
		assertEquals("First Book",actualBook.getTitle(),()->"Book title didn't match");
	}
}
