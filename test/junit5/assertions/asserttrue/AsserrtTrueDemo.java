package junit5.assertions.asserttrue;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.ibs.bookstore.model.Book;
import com.ibs.bookstore.service.BookService;

public class AsserrtTrueDemo {
	@Test
	public void assertTrueWithNoMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertTrue(listOfBooks.isEmpty());
	}

	@Test
	public void assertTrueWithMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertTrue(listOfBooks.isEmpty(), "Book List have some Books");
	}

	@Test
	public void assertTrueWithMessageSupplier() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertTrue(listOfBooks.isEmpty(), () -> "Book List have some Books");
	}

	@Test
	public void assertTrueWithBooleanSupplierAndNoMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertTrue(() -> listOfBooks.isEmpty());
	}

	@Test
	public void assertTrueWithBooleanSupplierAndMessage() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertTrue(() -> listOfBooks.isEmpty(), "Book List have some Books");
	}

	@Test
	public void assertTrueWithBooleanSupplierAndMessageSupplier() {
		BookService bookService = new BookService();
		Book firstBook = new Book("1", "First Book", "Wrox");
		bookService.addBook(firstBook);
		List<Book> listOfBooks = bookService.book();
		assertTrue(() -> listOfBooks.isEmpty(), () -> "Book List have some Books");
	}
}
