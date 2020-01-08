package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Book;
import service.BookService;

@Controller
@RequestMapping("/computerbooks")
public class ComputerBooksController {
	@Autowired
	BookService service;
	
	@RequestMapping(value = "/getcomputerbooks", method = RequestMethod.GET)
	public ModelAndView getComputerBookList() {
		ModelAndView modelView = new ModelAndView("computer-books-list");

		List<Book> books = service.getComputerBooks();
		modelView.addObject("bookList", books);
		
		return modelView;
	}

}

