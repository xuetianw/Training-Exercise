package OODSoloProject.Data;

import OODSoloProject.Model.User;

public interface Persistable<T> {
    T save (T t);
}
