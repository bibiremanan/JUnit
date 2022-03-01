package junit5.assertions.assertnull;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.ibs.bookstore.model.Book;
import com.ibs.bookstore.service.BookService;

public class AssertNullDemo {
	@Test
	public void assertNullWithNoMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("4");
		assertNull(actualBook);
	}
	@Test
	public void assertNullWithMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("4");
		assertNull(actualBook,"There is a book with this id(Not Null)");
	}
	@Test
	public void assertNullWithMessageSupplier() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		Book secondBook = new Book("2", "second Book", "Wrox");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book actualBook=bookService.getBookById("4");
		assertNull(actualBook,()->"There is a book with this id(Not Null)");
	}
}
