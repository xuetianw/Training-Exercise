package Module9;

public class Runner {
    public static void main(String[] args) {
        AdminUser adminUser1 = new AdminUser("Fred", "123123", "Fred Wu");
        AdminUser adminUser2 = new AdminUser("Jason", "321315", "Jason Yoeng");

        Customer customer1 = new Customer("Jerry", "321312", "Jerry Wang");
        Customer customer2 = new Customer("Dana", "321312", "Dana White");

//        System.out.println(adminUser1.changePassword("sadfasdf", "123124"));
//
//        adminUser1.accessWebsite();
//        customer1.accessWebsite();

        UserAccountManager userAccountManager = new UserAccountManager();
        userAccountManager.addUser(adminUser1);
        userAccountManager.addUser(adminUser2);
        userAccountManager.addUser(customer1);
        userAccountManager.addUser(customer2);

        System.out.println(userAccountManager.login("Fred" , "sadfasdf"));
        System.out.println(userAccountManager.login("Jason" , "321316"));
        System.out.println(userAccountManager.login("Fred" , "123123"));
        System.out.println(adminUser1.changePassword("sadfasdf", "123123"));
        System.out.println(userAccountManager.login("Fred" , "123123"));
        System.out.println(userAccountManager.login("Fred" , "sadfasdf"));


    }
}
