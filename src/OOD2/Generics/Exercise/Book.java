package OOD2.Generics.Exercise;

public class Book <D> implements CatalogItem<D> {
    D id;

    @Override
    public void setId(D id) {
        this.id = id;
    }

    @Override
    public D getId() {
        return id;
    }

}






