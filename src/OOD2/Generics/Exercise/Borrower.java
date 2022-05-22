package OOD2.Generics.Exercise;

public class Borrower implements CatalogItem<Double> {
    Double id;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "id=" + id +
                '}';
    }
}
