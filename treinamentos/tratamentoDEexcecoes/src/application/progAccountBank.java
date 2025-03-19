package application;
import model.entities.AccountBank;
import model.exception.BusinessAccountException;

import java.util.Locale;
import java.util.Scanner;

public class progAccountBank {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        AccountBank account = new AccountBank(number, holder,balance, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("Novo saldo: " + String.format("%.2f", account.getBalance()));
        }
        catch (BusinessAccountException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

}
