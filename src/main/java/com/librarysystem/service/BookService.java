package com.librarysystem.service;

import com.librarysystem.model.Book;
import java.util.List;

public interface BookService {
	public List<Book> getComputerBooks();
	public List<Book> getNovelBooks();

}
