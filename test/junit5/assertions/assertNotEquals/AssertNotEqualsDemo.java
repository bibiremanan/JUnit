package junit5.assertions.assertNotEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.ibs.bookstore.model.Book;
import com.ibs.bookstore.service.BookService;

public class AssertNotEqualsDemo {
	@Test
	public void assertNotEqualsWithNoMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("1");
		assertNotEquals("1",actualBook.getBookId());
		
	}
	@Test
	public void assertNotEqualsWithMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("1");
		assertNotEquals("1",actualBook.getBookId(),"Book id matches with expected");
	}
	@Test
	public void assertNotEqualsWithMessageSupplier() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("1");
		assertNotEquals("4",actualBook.getBookId(),()->"Book id matches with expected");
		
	}
}
