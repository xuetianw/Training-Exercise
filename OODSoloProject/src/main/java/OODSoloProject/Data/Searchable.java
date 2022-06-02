package OODSoloProject.Data;

import OODSoloProject.Model.User;

import java.util.List;

public interface Searchable {
    User findBytId(int id);
    List<User> findAll();
}
