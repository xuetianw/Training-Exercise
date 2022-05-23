package com.fdmgroup.bankDesignProject;

import java.util.List;

public class Person extends Customer {
    public Person(String name, String address) {
        super(name, address);
    }

    @Override
    public void chargeAllAccounts(double amount) {
        List<Account> list = getAccounts();
        for (Account account : list) {
            account.balance -= amount;
        }
    }
//    public Person(String person1, String address1) {
//        super();
//    }
}
