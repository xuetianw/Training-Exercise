package OODSoloProject.Data;

import OODSoloProject.Model.User;

import java.util.List;
import java.util.Objects;

public class UserArrayListRepository implements UserRepository{
    private List<User> users;
    public static int id = 1;

    public UserArrayListRepository() {
    }

    public UserArrayListRepository(List<User> users) {
        this.users = users;
    }

    static public int generateId() {
        return id++;
    }

    public List<User> getUsers() {
        return users;
    }



    @Override
    public void delete(User user) {
        users.remove(user);
    }

    @Override
    public boolean validate(String username, String password) {
        return users.stream().anyMatch(user -> (Objects.equals(user.getUserName(), username)
                && Objects.equals(user.getPassword(), password)));
//        for (User user : users) {
//            if(Objects.equals(user.getUserName(), username) && Objects.equals(user.getPassword(), password)) {
//                return true;
//            }
//        }

//        return false;
    }

    @Override
    public User findByUsername(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User save(User user) {
        for (User eachUser : users) {
            if (Objects.equals(eachUser.getUserName(), user.getUserName())) {
                eachUser.setFirstName(user.getUserName());
                eachUser.setLastName(user.getLastName());
                eachUser.setPassword(user.getPassword());
                eachUser.setEmail(user.getEmail());
                eachUser.setOrders(user.getOrders());
                return eachUser;
            }
        }

        users.add(user);
        return user;
    }

    @Override
    public User findBytId(int id) {
        for (User user : users) {
            if (user.getUserId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
