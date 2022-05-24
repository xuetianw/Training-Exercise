import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private List<Book> books;
    private ReadItemCommand readItemCommand;

    public Catalogue(ReadItemCommand readItemCommand, WriteItemCommand writeItemCommand) {
        books = new ArrayList<>();
        this.readItemCommand = readItemCommand;
        this.writeItemCommand = writeItemCommand;
    }

    private WriteItemCommand writeItemCommand;

    public List<Book> getAllBooks() {
        return readItemCommand.readAll();
    }

    public void addBook(Book book) {
        writeItemCommand.insertItem(book);
    }

    public void addBooks(List<Book> books) {
        for (Book book : books) {
            writeItemCommand.insertItem(book);
        }
    }

    public Book getBook(String isbn) {
        return readItemCommand.getItem(isbn);
    }

    public void deleteBook(Book book) {
        writeItemCommand.deleteItem(book);
    }

    public void deleteAllBooks() {
        List<Book> books1 = readItemCommand.readAll();
        for (Book book : books1) {
            writeItemCommand.deleteItem(book);
        }
    }
}
