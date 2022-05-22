package OOD2.Generics.Exercise;

public class Borrower<D> implements CatalogItem<D> {
    D id;

    public D getId() {
        return id;
    }

    public void setId(D id) {
        this.id = id;
    }
}
