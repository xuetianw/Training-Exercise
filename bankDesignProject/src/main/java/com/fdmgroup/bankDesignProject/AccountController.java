package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {
    List<Customer> customers;
    List<Account> accounts;
    public AccountController() {
        accounts = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public Customer createCustomer(String name, String address, String type) {
        if(type.equals("person")) {
            Person person = new Person(name, address);
            customers.add(person);
            return person;
        }
        if (type.equals("company")) {
            Company company = new Company(name, address);
            customers.add(company);
            return company;
        }
        return null;
    }

    public Account createAccount(Customer customer, String type) {
        if (type.equals("checking")) {
            CheckingAccount checkingAccount = new CheckingAccount();
            customer.addAccount(checkingAccount);
            accounts.add(checkingAccount);
            return checkingAccount;
        } else if (type.equals("savings")) {
            SavingsAccount savingsAccount = new SavingsAccount();
            customer.addAccount(savingsAccount);
            accounts.add(savingsAccount);
            return savingsAccount;
        }
        return null;
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
        for (Customer customer : customers) {
            customer.removeAccount(account);
        }
    }

    public void removeCustomer(Customer customer) {
//        for (Customer customer1 : customers) {
//            if (customer1 == customer) {
////                customer.removeAccount();
//            }
//        }
        List<Account> accounts1 = customer.getAccounts();
        for (Account account : accounts1) {
            accounts.remove(account);
        }
        customers.remove(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Account> getAccounts() {
        return accounts;
    }



}
