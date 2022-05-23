package com.fdmgroup.bankDesignProject;

import java.util.List;

public class Company extends Customer {
    public Company(String name, String address) {
        super(name, address);
    }

    @Override
    public void chargeAllAccounts(double amount) {
        List<Account> list = getAccounts();
        for (Account account : list) {
            if (account.getClass().toString().endsWith("CheckingAccount")) {
                account.balance -= amount;
            } else {
                account.balance -= 2 * amount;
            }
        }

    }
}
