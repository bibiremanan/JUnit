package com.ibs.bookstore.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.ibs.bookstore.model.Book;

public class BookService {
	private List<Book> listOfBooks = new ArrayList<>();

	public void addBook(Book book) {
		listOfBooks.add(book);
	}

	public List<Book> book() {
		return Collections.unmodifiableList(listOfBooks);

	}

	public Book getBookById(String bookId) {
		for (Book book : listOfBooks) {
			if (bookId.equals(book.getBookId())) {
				return book;
			}
		}
		return null;
	}
	public String[] getBookIdByPublisher(String publisher) {
		List <String> bookids=new ArrayList<>();
		for(Book book:listOfBooks) {
			if(publisher.equals(book.getPublisher())) {
				bookids.add(book.getBookId());
			}
		}
		return bookids.toArray(new String[bookids.size()]);
		}
	public List<String> getBookTitlesByPublisher(String publisher) {
		List <String> booktitles=new ArrayList<>();
		for(Book book:listOfBooks) {
			if(publisher.equals(book.getPublisher())) {
				booktitles.add(book.getTitle());
			}
		}
		return booktitles;
		}

}
