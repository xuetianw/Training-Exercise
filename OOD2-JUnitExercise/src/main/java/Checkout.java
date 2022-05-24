import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Checkout {
	private static boolean everyBookDirrent(List<Book> list) {
		Set<String> ISBNSet = new HashSet<>();
		for (Book book : list) {
			if (ISBNSet.contains(book.getISBN())) {
				return false;
			}
			ISBNSet.add(book.getISBN());
		}
		return true;
	}
	
	private static boolean twoOfSameBook(List<Book> list) {
		Set<String> ISBNSet = new HashSet<>();
		for (Book book : list) {
			if (ISBNSet.contains(book.getISBN())) {
				return false;
			}
			ISBNSet.add(book.getISBN());
		}
		return true;
	}
	
	public static double calculatePrice(Basket basket) {
		// TODO Auto-generated method stub
		double accumulative = 0.01;
		double totalDiscount = 0;

		List<Book> list = basket.getBooksInBasket();
		if (list.size() == 0) {
			return 0;
		}
		
		int numOfTimesForDiscounts = list.size() / 3;
		totalDiscount = numOfTimesForDiscounts * accumulative;
		if (list.size() >= 10) {
			totalDiscount += 0.1;
		}
		
		double totalOriginalPrice = list.stream()
				.mapToDouble(x -> x.getPrice()).sum();
		
		return (1 - totalDiscount) * totalOriginalPrice;
	}
	
}
