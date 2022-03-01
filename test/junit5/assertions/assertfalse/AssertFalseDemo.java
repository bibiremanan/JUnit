package junit5.assertions.assertfalse;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.ibs.bookstore.model.Book;
import com.ibs.bookstore.service.BookService;

public class AssertFalseDemo {
	@Test
	public void assertFalseWithNoMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertFalse(listOfBooks.isEmpty());
	}

	@Test
	public void assertFalseWithMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertFalse(listOfBooks.isEmpty(), "Book List is Empty");
	}

	@Test
	public void assertFalseWithMessageSupplier() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertFalse(listOfBooks.isEmpty(), () -> "Book List is Empty");
	}

	@Test
	public void assertFalseWithBooleanSupplierAndNoMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertFalse(() -> listOfBooks.isEmpty());
	}

	@Test
	public void assertFalseWithBooleanSupplierAndMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertFalse(() -> listOfBooks.isEmpty(), "Book List is Empty");
	}

	@Test
	public void assertFalseWithBooleanSupplierAndMessageSupplier() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertFalse(() -> listOfBooks.isEmpty(), () -> "Book List have some Books");
	}
}
