package Module9;

public class AdminUser extends UserAccount{
    public AdminUser(String username, String password, String fullName) {
        super(username, password, fullName);
    }

    @Override
    void accessWebsite() {
        System.out.println("accessing website with admin rights");
    }
}
