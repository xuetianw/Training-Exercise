package OOD2.Generics.Exercise;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setId(2);
        Book book2 = new Book();
        book2.setId(3);

        Catalog<CatalogItem<Integer>, Integer> catalog = new Catalog<>();

//        Catalog<CatalogItem<?>, Number> catalog = new Catalog<CatalogItem<Number>, Number>();
        catalog.addItem(book);
        catalog.addItem(book2);
//
        Borrower borrower1 = new Borrower();
        Borrower borrower2 = new Borrower();
//        catalog.addItem(borrower1);
//        catalog.addItem(borrower2);





        Borrower borrower = new Borrower();

//        Catalog<Borrower<Integer>, Integer> integerIdBorrowerCatalog = new Catalog<>();
//        Borrower<Integer> borrower = new Borrower<>();

//        integerIdBorrowerCatalog.addItem(borrower);
    }
}
