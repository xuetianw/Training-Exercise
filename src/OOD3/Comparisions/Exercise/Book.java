package OOD3.Comparisions.Exercise;

public class Book {
    private String title;
    private int isbn;
    private Double price;
    private int numberOfPages;
    private double rating;

    public Book(String title, int isbn, Double price, int numberOfPages, double rating) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
