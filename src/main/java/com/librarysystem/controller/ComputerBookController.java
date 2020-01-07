package com.librarysystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.librarysystem.service.BookService;
import com.librarysystem.model.Book;

@Controller
@RequestMapping("/computerbooks")
public class ComputerBookController {
	@Autowired
	BookService service;
	
	@RequestMapping(value = "/getcomputerbooks", method = RequestMethod.GET)
	public ModelAndView getComputerBookList() {
		ModelAndView modelView = new ModelAndView("book-list");

		List<Book> books = service.getComputerBooks();
		modelView.addObject("bookList", books);
		
		return modelView;
	}

}
