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
@RequestMapping("/novelbooks")
public class NovelBooksController {
	@Autowired
	BookService service;
	
	@RequestMapping(value = "/getnovelbooks", method = RequestMethod.GET)
	public ModelAndView getNovelBookList() {
		ModelAndView modelView = new ModelAndView("novel-books-list");

		List<Book> books = service.getNovelBooks();
		modelView.addObject("bookList", books);
		
		return modelView;
	}

}
