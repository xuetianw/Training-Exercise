package OODSoloProject.Data;

import OODSoloProject.Model.User;

import java.util.List;

public interface Searchable<T> {
    T findById(int id);
    List<T> findAll();
}
