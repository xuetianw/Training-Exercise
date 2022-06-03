package OODSoloProject.Data;

import OODSoloProject.Model.User;

public interface Removeable<T> {
    void delete(T user);
}
