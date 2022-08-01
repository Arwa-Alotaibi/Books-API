package com.arwa.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.arwa.mvc.models.Book;
import com.arwa.mvc.services.BookService;

@Controller
public class BookController {

	@Autowired
	 BookService bookService;
	
	@GetMapping("/book/{id}")
	public String Show(Model model ,@PathVariable("id") Long id) {
		
    	Book b = bookService.findBook(id);
    	
    	List<Book> books= bookService.allBooks();
    	model.addAttribute("books",b);
    	model.addAttribute("books",books);
    	

		
		return "show.jsp";
		
	}
		
}


