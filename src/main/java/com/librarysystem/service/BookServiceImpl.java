package com.librarysystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.librarysystem.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public List<Book> getComputerBooks() {
		List<Book> books = new ArrayList<Book>();

		books.add(new Book("Java", "Computer"));
		books.add(new Book("HTML", "Computer"));
		books.add(new Book("Python", "Computer"));

		return books;
	}

	@Override
	public List<Book> getNovelBooks() {
		List<Book> books = new ArrayList<Book>();

		books.add(new Book("Cook", "Novel"));
		books.add(new Book("Sing", "Novel"));
		books.add(new Book("Build", "Novel"));
		
		return books;
	}

}
