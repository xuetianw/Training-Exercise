package Module9;

import java.util.Objects;

public abstract class UserAccount {
    private String username;
    private String password;
    private String fullName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserAccount(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    boolean changePassword(String newPass, String confirmPass) {
        if (Objects.equals(password, confirmPass)) {
            password = newPass;
            return true;
        };
        return false;
    }

    abstract void accessWebsite();
}
