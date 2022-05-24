import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class CatalogueTest {
    Catalogue catalogue;
    ReadItemCommand mockReadItemCommand;
    WriteItemCommand mockWriteItemCommand;

    @BeforeEach
    void setUp() {
        mockReadItemCommand = mock(ReadItemCommand.class);
        mockWriteItemCommand = mock(WriteItemCommand.class);
        catalogue = new Catalogue(mockReadItemCommand, mockWriteItemCommand);
    }


    //test1
    @Test
    public void getAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
        List<Book> books = catalogue.getAllBooks(); //Act
        assertEquals(0, books.size()); //assert
    }


    //Test 2
    @Test
    public void getAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
        //arrange
        List<Book> books = new ArrayList<>(
                Arrays.asList(
                        new Book("1"),
                        new Book("2"),
                        new Book("3")
                )
        );
        when(mockReadItemCommand.readAll()).thenReturn(books); //stub

        catalogue.getAllBooks(); //act

        verify(mockReadItemCommand, times(1)).readAll(); // verify
    }

    @Test
    public void getAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){
        //arrange
        List<Book> books = new ArrayList<>(
                Arrays.asList(
                        new Book("1"),
                        new Book("2"),
                        new Book("3")
                )
        );

        when(mockReadItemCommand.readAll()).thenReturn(books); //stub

        List<Book> books1 = catalogue.getAllBooks(); //act

        assertEquals(books, books1); // assert
    }

    //test4
    @Test
    public void test4() {
        Book book = new Book("1");

        catalogue.addBook(book); // act

        verify(mockWriteItemCommand, times(1)).insertItem(book); // assert
    }

    //test5
    @Test
    public void test5() {
        // arrange
        Book book = new Book("1");
        Book book2 = new Book("2");
        Book book3 = new Book("3");
        List<Book> books = new ArrayList<>(
                Arrays.asList(book, book2, book3));

        catalogue.addBooks(books);//Act

        // verify
        verify(mockWriteItemCommand, times(1)).insertItem(book);
        verify(mockWriteItemCommand, times(1)).insertItem(book2);
        verify(mockWriteItemCommand, times(1)).insertItem(book3);
    }

    //test6
    @Test
    public void test6() {
        // arrange
        String ISBN = "1";
        Book book = new Book(ISBN);

        when(mockReadItemCommand.getItem(ISBN)).thenReturn(book); //stub

        // act
        Book returnedBook = catalogue.getBook(ISBN);

        //asserts
        verify(mockReadItemCommand, times(1)).getItem(ISBN);
        assertEquals(ISBN, returnedBook.getISBN());
    }

    //test7
    @Test
    public void test7() {
        Book book = new Book("1"); //arrange

        catalogue.deleteBook(book); //act

        //verify
        verify(mockWriteItemCommand, times(1)).deleteItem(book);
    }

    //test8
    @Test
    public void test8() {
        // arrange
        Book book = new Book("1");
        Book book2 = new Book("2");
        Book book3 = new Book("3");
        List<Book> books = new ArrayList<>(
                Arrays.asList(book, book2, book3));

        when(mockReadItemCommand.readAll()).thenReturn(books); //stub

        catalogue.deleteAllBooks(); //Act

        ///Assert
        verify(mockReadItemCommand, times(1)).readAll();

        verify(mockWriteItemCommand, times(1)).deleteItem(book);

        verify(mockWriteItemCommand, times(1)).deleteItem(book2);

        verify(mockWriteItemCommand, times(1)).deleteItem(book3);

    }







}