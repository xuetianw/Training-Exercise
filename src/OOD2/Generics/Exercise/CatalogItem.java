package OOD2.Generics.Exercise;

public interface CatalogItem<T extends Number> {
    T getId();
    void setId(T id);
}
