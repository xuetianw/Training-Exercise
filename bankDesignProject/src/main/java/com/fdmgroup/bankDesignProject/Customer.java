package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer extends AccountController{
    private final long CUSTOMER_ID;
    private static long nextCustomerId = 2000000;
    private String name;
    private String address;
    private List<Account> accounts;

    public Customer(String name, String address) {
        accounts = new ArrayList<>();
        CUSTOMER_ID = nextCustomerId;
        nextCustomerId += 7;
        this.name = name;
        this.address = address;
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    @Override
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public abstract void chargeAllAccounts(double amount);

    @Override
    public List<Account> getAccounts() {
        return accounts;
    }

    public long getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
