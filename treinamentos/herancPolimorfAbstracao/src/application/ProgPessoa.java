package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJurídica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgPessoa {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List <Pessoa> list = new ArrayList<>();

        for (int i = 1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual ou company (i/c)?");
            char let = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (let == 'i') {
                System.out.print("Health expenditures: ");
                double gastSaude = sc.nextDouble();
                list.add(new PessoaFisica(name, anualIncome, gastSaude));
            } else {
                System.out.print("Number of employees: ");
                int numberFunc = sc.nextInt();
                list.add(new PessoaJurídica(name, anualIncome, numberFunc));
            }
        }

        System.out.println();
        double sum = 0.0;
        System.out.println("TAXES PAID:");
        for (Pessoa ps : list) {
            double taxa = ps.impostos();
            System.out.println(ps.getNome() + ": $" + String.format("%.2f", taxa));
            sum += taxa;
        }

        System.out.println();
        System.out.print("TOTAL TAXES: $" + String.format("%.2f", sum));

        sc.close();
    }
}