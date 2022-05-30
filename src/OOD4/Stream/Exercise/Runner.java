package OOD4.Stream.Exercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345678, 987654, "Mr J Smith",	"savings", 1.1, 25362.91);
        BankAccount account2 = new BankAccount(87654321, 234567, "Ms J Jones", "current/checking", 0.2, 550);
        BankAccount account3 = new BankAccount(74639572, 946284, "Dr T Williams", "savings", 1.1, 4763.32);
        BankAccount account4 = new BankAccount(94715453, 987654, "Ms S Taylor", "savings", 1.1, 10598.01);
        BankAccount account5 = new BankAccount(16254385, 234567, "Mr P Brown", "current/checking", 0.2, -195.74);
        BankAccount account6 = new BankAccount(38776543, 946284, "Ms F Davies",	"current/checking", 0.2, -503.47);
        BankAccount account7 = new BankAccount(87609802, 987654, "Mr B Wilson",	"savings", 1.1,	2.5);
        BankAccount account8 = new BankAccount(56483769, 234567, "Dr E Evans", "current/checking", 0.2, -947.72);

        ArrayList<BankAccount> bankAccounts = new ArrayList<>(
                Arrays.asList(account1, account2, account3, account4, account5,
                        account6, account7, account8)
        );

        // 1.2Use streams to find the following information

        // 1.The number of current/checking accounts in the ArrayList.
        System.out.println(bankAccounts.stream().filter(b -> b.getAccountType().equals("current/checking")).count());
        System.out.println();

        // 2.The number of accounts which are overdrawn.
        System.out.println(bankAccounts.stream().filter(b -> b.getBalance() < 0).count());
        System.out.println();

        // 3.The highest account balance.
        bankAccounts.stream().max((b1, b2) -> Double.compare(b1.getBalance(), b2.getBalance())).ifPresent(b -> System.out.println(b.getBalance()));
        System.out.println();

        // 4.The average account balance.
        bankAccounts.stream().mapToDouble(b -> b.getBalance()).average().ifPresent(b -> System.out.println(b));
        System.out.println();

        // 5.The average balance of accounts which are in credit.
        bankAccounts.stream().filter(b -> b.getBalance() > 0).mapToDouble(b -> b.getBalance()).average().ifPresent(b -> System.out.println(b));
        System.out.println();

        // 6.The sum of all overdrafts.
        double overdraftsSum = bankAccounts.stream().filter(b -> b.getBalance() < 0).mapToDouble(b -> b.getBalance()).sum();
        System.out.println();

        // 7.The total amount interest due to be paid to accounts which are in credit.
        double interestsTotal = bankAccounts.stream().filter(b -> b.getBalance() > 0).mapToDouble(b -> b.getInterestRate() * b.getAccountNumber() / 100).sum();
        System.out.println();

        /*
        1.3Use streams to do the following operations

         */

        bankAccounts.forEach(b -> System.out.println(b));
        System.out.println();

        // 1.Create an ArrayList of Strings containing the names of all the account holders who are overdrawn.
        List<String> namesOfAccounts = (bankAccounts.stream().filter(b -> b.getBalance() < 0).map(b -> b.getAccountHolder()).collect(Collectors.toList()));
        bankAccounts.forEach(b -> System.out.println(b));
        System.out.println();

        // 2.Increase the interest rate on savings accounts to 1.3.
        bankAccounts.stream().filter(b -> b.getAccountType().equals("savings")).forEach(b -> b.setBalance(1.3));
        bankAccounts.forEach(b -> System.out.println(b));
        System.out.println();

        // 3.Replace bank code 234567 with a new bank code 123456.
        bankAccounts.stream().forEach(b -> b.setBankCode(b.getBankCode() == 234567 ? 123456 : b.getBankCode()));
        bankAccounts.forEach(b -> System.out.println(b));
        System.out.println();

        // 4.Create a new ArrayList which only contains accounts with bank code 987654.
        List<BankAccount> arrayList = bankAccounts.stream().filter(b -> b.getBankCode() == 987654).collect(Collectors.toList());

        // 5.Create a new ArrayList which only contains accounts where the account holder has the title ‘Dr’.
        List<BankAccount> accountWithHolderWithDr = bankAccounts.stream().filter(b -> b.getAccountHolder().startsWith("Dr")).collect(Collectors.toList());
        System.out.println();

        // 1.4Use the streams reduce() method to find the following

        //1.The bank account with the highest balance.
        bankAccounts.stream().reduce((b1, b2) -> (b1.getBalance() > b2.getBalance()) ? b1 : b2).ifPresent(b -> System.out.println(b));
        System.out.println();

        //2.The bank account with the lowest balance for sort code 987654.
        bankAccounts.stream().reduce((b1, b2) -> (b1.getBalance() > b2.getBalance()) ? b2 : b1).ifPresent(b -> System.out.println(b));
        System.out.println();

    }
}
