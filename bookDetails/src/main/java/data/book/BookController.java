package data.book;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	private BookService bookService;
	
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@GetMapping("/books")
	
	public List<Book> getAllBooks(){
		List<Book> book = bookService.findAllBooks();
		return book;
	}
}
