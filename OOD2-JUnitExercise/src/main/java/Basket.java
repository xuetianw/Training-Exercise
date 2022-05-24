import java.util.ArrayList;
import java.util.List;

public class Basket {
	private List<Book> list;

	public Basket() {
		super();
		list = new ArrayList<Book>();
	}

	public List<Book> getBooksInBasket() {
		return list;
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub
		list.add(book);
	}

}
