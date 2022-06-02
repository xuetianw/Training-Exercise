package OODSoloProject.Data;

import OODSoloProject.Model.User;

public interface UserRepository extends Searchable, Persistable, Removeable{
    boolean validate(String username, String password);

    User findByUsername(String userName);
}
