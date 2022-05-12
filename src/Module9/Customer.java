package Module9;

public class Customer extends UserAccount{
    public Customer(String username, String password, String fullName) {
        super(username, password, fullName);
    }

    @Override
    void accessWebsite() {
        System.out.println("accessing website as customer");
    }
}
