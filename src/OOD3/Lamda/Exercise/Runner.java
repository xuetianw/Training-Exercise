package OOD3.Lamda.Exercise;

import OOD3.Lamda.Demo.Trainee;

import java.util.*;
import java.util.function.*;

public class Runner {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(12345678,987654, "Mr J Smith",	"savings", 1.1, 25362.91);
        BankAccount bankAccount2 = new BankAccount(87654321,	234567,	"Ms J Jones", "current/checking", 0.2, 550);
        BankAccount bankAccount3 = new BankAccount(74639572, 946284, "Dr T Williams", "savings", 1.1, 4763.32);
        BankAccount bankAccount4 = new BankAccount(94715453, 987654, "Ms S Taylor", "savings", 1.1, 10598.01);
        BankAccount bankAccount5 = new BankAccount(16254385, 234567, "Mr P Brown", "current/checking", 0.2, -195.74);
        BankAccount bankAccount6 = new BankAccount(38776543, 946284, "Ms F Davies",	"current/checking", 0.2, -503.47);
        BankAccount bankAccount7 = new BankAccount(87609802, 987654, "Mr B Wilson",	"savings", 1.1,	2.5);
        BankAccount bankAccount8 = new BankAccount(56483769, 234567, "Dr E Evans", "current/checking", 0.2, -947.72);

        // q1
        Function<BankAccount, String> function = b -> b.getAccountHolder() + " " + b.getBalance();
        System.out.println(function.apply(bankAccount3));
        System.out.println();


        //q2
        Function<BankAccount, Double> function2 = b -> b.getBalance() * b.getInterestRate() / 100;
        System.out.println(function2.apply(bankAccount2));
        System.out.println();


        //q3
        Function<BankAccount, Double> function3 = b -> b.getBalance() < 0 ? 0 : b.getBalance() * b.getInterestRate() / 100;
        System.out.println(function3.apply(bankAccount2));
        System.out.println(function3.apply(bankAccount8));
        System.out.println();


        //q4
        Predicate<BankAccount> function4 = b -> b.getAccountType().equals("current/checking");
        System.out.println(function4.test(bankAccount1));
        System.out.println(function4.test(bankAccount6));
        System.out.println();

        //q5
        Predicate<BankAccount> function5 = b -> b.getBalance() < 0;
        System.out.println(function5.test(bankAccount5));
        System.out.println(function5.test(bankAccount7));
        System.out.println();


        //q6
        BinaryOperator<BankAccount> function6 = (b1, b2) -> b1.getBalance() > b2.getBalance() ? b1 : b2;
        System.out.println(function6.apply(bankAccount3, bankAccount4).equals(bankAccount4));
        System.out.println();

        //q7
        Consumer<BankAccount> function7 = b -> b.setBalance(b.getBalance() - 10);
        function7.accept(bankAccount2);
        function7.accept(bankAccount6);
        System.out.println();

        //q8
        BiConsumer<BankAccount, Integer> function8 = (b1, num) -> b1.setBalance(b1.getBalance() - num);
        function8.accept(bankAccount1, 100);
        function8.accept(bankAccount5, 50);
        System.out.println();


        //1.3.1
        ArrayList<BankAccount> bankAccounts = new ArrayList<>(
                Arrays.asList(bankAccount1, bankAccount2, bankAccount3, bankAccount4, bankAccount5,
                        bankAccount6, bankAccount7, bankAccount8)
        );

        System.out.println();

        //1.3.2
        bankAccounts.forEach(b -> System.out.println("account number : " +  b.getAccountNumber()
                + " holder: " + b.getAccountHolder() + " type:" + b.getAccountType() + " balance " + b.getBalance()));
        System.out.println();

        //1.3.3
        bankAccounts.forEach(b -> b.setBalance(b.getBalance() - 10));
        bankAccounts.forEach(b -> System.out.println("account number : " +  b.getAccountNumber()
                + " holder: " + b.getAccountHolder() + " type:" + b.getAccountType() + " balance " + b.getBalance()));
        System.out.println();

//        //1.3.4
//        bankAccounts.removeIf(b -> b.getBalance() < -500);
//        bankAccounts.forEach(b -> System.out.println("account number : " +  b.getAccountNumber()
//                + " holder: " + b.getAccountHolder() + " type:" + b.getAccountType() + " balance " + b.getBalance()));
//        System.out.println();
//
//        //1.3.5
//        bankAccounts.removeIf(b -> b.getAccountType().equals("savings"));
//        bankAccounts.forEach(b -> System.out.println("account number : " +  b.getAccountNumber()
//                + " holder: " + b.getAccountHolder() + " type:" + b.getAccountType() + " balance " + b.getBalance()));
//        System.out.println();


        //1.4.1
        Comparator<BankAccount> comparator1 = (b1, b2) -> Double.compare(b1.getBalance(), b2.getBalance());
        bankAccounts.sort(comparator1);
        bankAccounts.forEach(b -> System.out.println("account number : " +  b.getAccountNumber()
                + " holder: " + b.getAccountHolder() + " type:" + b.getAccountType() + " balance " + b.getBalance()));
        System.out.println();

        //1.4.2
        Comparator<BankAccount> comparator2 = (b1, b2) -> b1.getAccountType().compareTo(b2.getAccountType());
        bankAccounts.sort(comparator2);
        bankAccounts.forEach(b -> System.out.println("account number : " +  b.getAccountNumber()
                + " holder: " + b.getAccountHolder() + " type:" + b.getAccountType() + " balance " + b.getBalance()));
        System.out.println();

        //1.4.3
        Comparator<BankAccount> comparator3 = (b1, b2) -> b1.getAccountNumber() - b2.getAccountNumber();
        bankAccounts.sort(comparator3);
        bankAccounts.forEach(b -> System.out.println("account number : " +  b.getAccountNumber()
                + " holder: " + b.getAccountHolder() + " type:" + b.getAccountType() + " balance " + b.getBalance()));
        System.out.println();

        //1.4.4
        Comparator<BankAccount> comparator4 = comparator1.thenComparing(comparator2);
        bankAccounts.sort(comparator4);
        bankAccounts.forEach(b -> System.out.println("account number : " +  b.getAccountNumber()
                + " holder: " + b.getAccountHolder() + " type:" + b.getAccountType() + " balance " + b.getBalance()));
        System.out.println();


        //1.5.1
        Map<Integer, Integer> map = new HashMap<>();

        //1.5.2
        for(BankAccount bankAccount : bankAccounts) {
            int bankCode = bankAccount.getBankCode();
            map.merge(bankCode, 1, (currentCount, one) -> currentCount + one);
        }

        for(int k : map.keySet()) {
            System.out.println("back code : " + k + " occourence :" + map.get(k));
        }
        System.out.println();

        //1.5.3
        Map<Integer, Double> map2 = new HashMap<>();
        //1.5.4
        for(BankAccount bankAccount : bankAccounts) {
            int bankCode = bankAccount.getBankCode();
            double balance = bankAccount.getBalance();
            map2.merge(bankCode, balance, (currentAccountBalance, currentTotalBalance) -> currentTotalBalance + currentAccountBalance);
        }

        for(int k : map2.keySet()) {
            System.out.println("back code : " + k + " total balance :" + map2.get(k));
        }
        System.out.println();

/*
        Map<Integer, BankAccount> map3 = new HashMap<>();
        for (BankAccount bankAccount :bankAccounts) {
            int bankCode = bankAccount.getBankCode();
        }

        int id = 1;
        for(BankAccount bankAccount : bankAccounts) {
            map3.merge(id++, bankAccount, (dummy, account) -> account);
        }

        map3.forEach((bankId, bankAccount) -> System.out.println("the id id:" + bankId + "the bank info is " + bankAccount));
*/
    }
}
