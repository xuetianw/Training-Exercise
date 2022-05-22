package OOD2.Generics.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Catalog <T extends CatalogItem<X>, X extends Number> {
    private List<T> items = new ArrayList<>();

    public List<T> getItems() {
        return items;
    }

    void addItem(T item) {
        items.add(item);
    }

    T findItem(int id) {
        for (T t : items) {
            if (t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }
}
