package OODSoloProject.service;

import OODSoloProject.Data.BookRepository;
import OODSoloProject.Model.Book;
import OODSoloProject.Model.BookGenre;
import OODSoloProject.customexception.ItemNotFoundException;
import OODSoloProject.customexception.UserNotFoundException;

import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class BookService {
    private BookRepository bookBookRepository;

    public BookService(BookRepository bookBookRepository) {
        this.bookBookRepository = bookBookRepository;
    }

    //2.a
    public List<Book> getAllBooks() {
        return bookBookRepository.findAll();
    }

    //2.b
    public List<Book> getBooksOfGenre(BookGenre bookGenre) {
        List<Book> allBooks = bookBookRepository.findAll();
        return allBooks.stream().filter(book -> book.getBookGenre() == bookGenre).collect(Collectors.toList());
    }

    //2.c
    public List<Book> searchBooksByTitle(String title) {
        List<Book> allBooks = bookBookRepository.findAll();
        return allBooks.stream().filter(book -> Objects.equals(book.getTitle(), title)).collect(Collectors.toList());
    }

    //2.d
    public List<Book> searchBooksByAuthorName(String bookAuthorNameToSearch) {
        List<Book> allBooks = bookBookRepository.findAll();
        return allBooks.stream()
                .filter(book -> Pattern.compile(bookAuthorNameToSearch).matcher(book.getAuthor()).find()).collect(Collectors.toList());

    }

    //2.e
    public Book findById(int id) throws ItemNotFoundException {
        Book returnedBook = bookBookRepository.findById(id);
        if (returnedBook == null){
            throw new ItemNotFoundException("id :" + id + ": not found");
        }
        return returnedBook;
    }
}
