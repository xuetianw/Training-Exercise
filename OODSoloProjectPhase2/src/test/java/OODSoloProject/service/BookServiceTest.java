package OODSoloProject.service;

import OODSoloProject.Data.BookRepository;
import OODSoloProject.Model.Book;
import OODSoloProject.Model.BookGenre;
import OODSoloProject.customexception.ItemNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {
    BookService bookService;
    BookRepository mockBookRepository;

    @BeforeEach
    void setUp() {
        mockBookRepository = mock(BookRepository.class);
        bookService = new BookService(mockBookRepository);
    }


    @Test
    void getAllBooksTest() {
        Book book1 = new Book();
        Book book2 = new Book();
        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2));


        when(mockBookRepository.findAll()).thenReturn(books);

        List<Book> returnBooks = bookService.getAllBooks();

        verify(mockBookRepository, times(1)).findAll();

        assertEquals(books, returnBooks);
    }

    @Test
    void getBooksOfGenreAllBooksHaveLabelTest() {
        Book book1 = new Book();
        book1.setBookGenre(BookGenre.label);
        Book book2 = new Book();
        book2.setBookGenre(BookGenre.label);
        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2));


        when(mockBookRepository.findAll()).thenReturn(books);

        List<Book> returnedBooks = bookService.getBooksOfGenre(BookGenre.label);

        verify(mockBookRepository, times(1)).findAll();

        assertEquals(books, returnedBooks);
    }

    @Test
    void getBooksOfGenreNotAllBooksHaveGenreTest() {
        Book book1 = new Book();
        book1.setBookGenre(BookGenre.label);
        Book book2 = new Book();
        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2));
        List<Book> books2 = new ArrayList<>(Arrays.asList(book1));

        when(mockBookRepository.findAll()).thenReturn(books);

        List<Book> returnedBooks = bookService.getBooksOfGenre(BookGenre.label);

        verify(mockBookRepository, times(1)).findAll();

        assertEquals(books2, returnedBooks);
    }

    @Test
    void searchBooksByTitleAllBookHaveThatTitleTest() {
        String title1 = "title1";
        Book book1 = new Book();
        book1.setTitle(title1);
        Book book2 = new Book();
        book2.setTitle(title1);
        List<Book> expectedBooks = new ArrayList<>(Arrays.asList(book1, book2));

        when(mockBookRepository.findAll()).thenReturn(expectedBooks);

        List<Book> returnedBooks = bookService.searchBooksByTitle(title1);

        verify(mockBookRepository, times(1)).findAll();

        assertEquals(expectedBooks, returnedBooks);
    }


    @Test
    void searchBooksByTitleNotAllBookHaveThatTitleTest() {
        String title1 = "title1";
        Book book1 = new Book();
        book1.setTitle(title1);
        Book book2 = new Book();
        book2.setTitle("wrong");
        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2));
        List<Book> expectedBooks = new ArrayList<>(Arrays.asList(book1));

        when(mockBookRepository.findAll()).thenReturn(books);

        List<Book> returnedBooks = bookService.searchBooksByTitle(title1);

        verify(mockBookRepository, times(1)).findAll();

        assertEquals(expectedBooks, returnedBooks);
    }

    @Test
    void searchBooksByAuthorNameTest() {
        Book book1 = new Book();
        Book book2 = new Book();
        String author = "author";

        book1.setAuthor(author);
        book2.setAuthor("Mr. author lastname");


        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2));

        when(mockBookRepository.findAll()).thenReturn(books);

        List<Book> returnedBook = bookService.searchBooksByAuthorName(author);

        verify(mockBookRepository, times(1)).findAll();

        assertEquals(books, returnedBook);
    }

    @Test
    void findByIdTestUserExistAndNotExist() throws ItemNotFoundException {
        Book expectedBook = new Book();
        expectedBook.setItemId(1);
        Book book2 = new Book();
        book2.setItemId(2);

        List<Book> books = new ArrayList<>(Arrays.asList(expectedBook, book2));

        when(mockBookRepository.findById(1)).thenReturn(expectedBook);

        Book returnedBook = bookService.findById(1);

        verify(mockBookRepository, times(1)).findById(1);

        assertEquals(expectedBook, returnedBook);

        assertThrows(ItemNotFoundException.class, () -> bookService.findById(3));
    }

}