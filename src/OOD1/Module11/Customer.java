package OOD1.Module11;

import java.util.Objects;

public class Customer extends UserAccount {
    private static int minPasswordLength;

    public Customer(String username, String password, String fullName) {
        super(username, password, fullName);
    }

    @Override
    void accessWebsite() {
        System.out.println("accessing website as customer");
    }
    @Override
    boolean changePassword(String newPass, String confirmPass) {
        if (Objects.equals(super.getPassword(), confirmPass)
                && newPass.length() >= minPasswordLength) {
            super.changePassword(newPass, confirmPass);
            return true;
        }
        return false;
    }

    public static int getMinPasswordLength() {
        return minPasswordLength;
    }

    public static void setMinPasswordLength(int minPasswordLength) {
        Customer.minPasswordLength = minPasswordLength;
    }
}
