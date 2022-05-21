package OOD1.Module11;

import java.util.Objects;

public class AdminUser extends UserAccount {
    private static int minPasswordLength;

    public AdminUser(String username, String password, String fullName) {
        super(username, password, fullName);
    }

    @Override
    void accessWebsite() {
        System.out.println("accessing website with admin rights");
    }

    @Override
    boolean changePassword(String newPass, String confirmPass) {
        if (Objects.equals(super.getPassword(), confirmPass)
                && newPass.length() >= minPasswordLength) {
            super.changePassword(newPass, confirmPass);
            return true;
        };
        return false;
    }

    boolean changePassword(String newPass, String confirmPass, UserAccount user) {
        if (Objects.equals(user.getPassword(), confirmPass)
                && confirmPass.length() >= minPasswordLength) {
            user.changePassword(newPass, confirmPass);
            return true;
        };
        return false;
    }

    static int getMinPasswordLength() {
        return minPasswordLength;
    }

    static void setMinPasswordLength(int length) {
        minPasswordLength = length;
    }
}
