package OOD2.Generics.Exercise;

public class Main {
    public static void main(String[] args) {
        Book<Double> book = new Book<>();
        Catalog<Book<Double>, Double> doubleIdBookCatalog = new Catalog<>();

        doubleIdBookCatalog.addItem(book);

        Catalog<Borrower<Integer>, Integer> integerIdBorrowerCatalog = new Catalog<>();
        Borrower<Integer> borrower = new Borrower<>();

        integerIdBorrowerCatalog.addItem(borrower);
    }
}
