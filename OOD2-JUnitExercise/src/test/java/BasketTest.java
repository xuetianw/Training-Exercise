import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasketTest {

	static Basket basket;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {		
//		System.out.println("triggered");
	}

	@BeforeEach
	void setUp() throws Exception {
		basket = new Basket();
//		System.out.println("triggered");
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		//Test code
		List<Book> list = basket.getBooksInBasket();
		assertEquals(0, list.size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		//Test code
		Book book = new Book("random name", 1);
		basket.addBook(book);
		assertEquals(1, basket.getBooksInBasket().size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBook() {
		//Test code
		Book book = new Book("random name", 1);
		Book book2 = new Book("random name2", 1);

		basket.addBook(book);
		basket.addBook(book2);
		assertEquals(2, basket.getBooksInBasket().size());
	}
}
