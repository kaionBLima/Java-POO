package application;
import model.entities.AccountBank;

import java.util.Locale;
import java.util.Scanner;

public class progAccountBank {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AccountBank account = new AccountBank();

        System.out.println("Enter account data:");

        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        String holder = sc.nextLine();
        System.out.println("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();


    }

}
