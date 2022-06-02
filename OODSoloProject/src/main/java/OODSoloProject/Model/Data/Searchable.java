package OODSoloProject.Model.Data;

import OODSoloProject.Model.Model.User;

import java.util.List;

public interface Searchable {
    User findBytId(int id);
    List<User> findAll();
}
