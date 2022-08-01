package com.arwa.mvc.services;


import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;
import com.arwa.mvc.models.Book;
import com.arwa.mvc.repositories.BookRepository;
@Service
public class BookService {
	private final BookRepository  bookRepository;
	
	
	public BookService(BookRepository  bookRepository) {
		 this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    
     // update a book :)
    public Book updateBook(Long id,String title, String desc, String lang, Integer numOfPages) { 
    	Book b = bookRepository.findById(id).get();
    	b.setTitle(b.getTitle());
    	b.setDescription(b.getDescription());
    	b.setLanguage(b.getDescription());
    	b.setNumberOfPages(b.getNumberOfPages());
    	return bookRepository.save(b);  
    }  
    // Delete a book :)
    public  void deleteBook(Long id) {
    	 bookRepository.deleteById(id);
    	
    }
    
	}



