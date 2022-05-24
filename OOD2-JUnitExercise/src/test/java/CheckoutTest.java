import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckoutTest {
//	Checkout checkout;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
//		checkout = new Checkout();
	}

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		Basket basket = new Basket();
		double price = Checkout.calculatePrice(basket);
		assertEquals(0.0, price);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBooks() {
		//test code
		Basket basket = new Basket();
		basket.addBook(new Book("Random Book", 2));
		double price = Checkout.calculatePrice(basket);
		assertEquals(2, price);
	}
	
	// Test 4
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithThreeBooks() {
		//Test code
		Book book = new Book("random name", 25.99);
		Book book2 = new Book("random name2", 25.99);
		Book book3 = new Book("random name2", 25.99);

		Basket basket = new Basket();
		basket.addBook(book);
		basket.addBook(book2);
		basket.addBook(book3);

		double price = Checkout.calculatePrice(basket);

		assertEquals(77.19, price, 0.1);
	}
	
	//Test 5
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithSevenBooks() {		
		Book book = new Book("random name", 25.99);
		Basket basket = new Basket();
		
		for (int i = 0; i < 7; i++) {
			basket.addBook(book);
		}
	
		double price = Checkout.calculatePrice(basket);

		assertEquals(178.29, price, 0.1);
	}
	
	
	//Test 6
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTenBooks() {
		//Test code
		
		Book book = new Book("random name", 25.99);
		Basket basket = new Basket();

		for (int i = 0; i < 10; i++) {
			basket.addBook(book);
		}
		
		double price = Checkout.calculatePrice(basket);
		double expectedPrice = 25.99 * 10 * 0.87;

		assertEquals(expectedPrice, price, 0.1);
	}
	
}
