package data.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService implements BookIservice{

	public List<Book> findAllBooks(){
		ArrayList<Book> book = new ArrayList<>();
		    book.add(new Book(1, "Maths", 230.5));
	        book.add(new Book(2, "Physics", 180.0));
	        book.add(new Book(3, "Chemistry", 200.75));
	        book.add(new Book(4, "Biology", 150.25));
	        book.add(new Book(5, "English", 120.0));
	        book.add(new Book(6, "History", 175.5));
	        book.add(new Book(7, "Geography", 160.0));
	        book.add(new Book(8, "Computer Science", 300.0));
	        book.add(new Book(9, "Economics", 210.0));
	        book.add(new Book(10, "Political Science", 190.0));
		
		return book;
	}
}
