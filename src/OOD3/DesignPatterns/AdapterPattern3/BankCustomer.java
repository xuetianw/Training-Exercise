package OOD3.DesignPatterns.AdapterPattern3;

import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard {
    @Override
    public void giveBankDetails() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the account holder name :");
            String customername = scanner.nextLine();

            System.out.print("Enter the account number:");
            long accno = Long.parseLong(scanner.nextLine());

            System.out.print("Enter the bank name :");
            String bankname = scanner.nextLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();

        return ("The Account number " + accno + " of " + accholdername + " in "
                + bname + "bank is valid and authenticated for issuing the credit card. ");
    }
}//End of the BankCustomer class.