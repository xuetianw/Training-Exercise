package OOD2.Generics.Exercise;

import java.util.List;

public class Catalog<T extends CatalogItem<D>, D extends Number> {
    private List<T> items;

    void addItem(T item) {
        items.add(item);
    }

    T findItem(D id) {
        for (T t : items) {
            if (t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }
}
