package OOD1.Module11;

import java.util.ArrayList;
import java.util.Objects;

public class UserAccountManager{
    private ArrayList<UserAccount> accounts = new ArrayList<>();

    public void addUser(UserAccount user) {
        accounts.add(user);
    }

    boolean login(String username, String password) {
        for (UserAccount userAccount : accounts) {
            if (Objects.equals(userAccount.getUsername(), username)
                    && Objects.equals(password, userAccount.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
