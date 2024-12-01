package application;

import java.util.Locale;
import java.util.Scanner;
import entities.InfoPersionato;

public class Persionato {

    public static void main(String[] arg) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        InfoPersionato[] vect = new InfoPersionato[10];

        System.out.println("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int numQuarto = sc.nextInt();

            vect[numQuarto] = new InfoPersionato(nome, email);
        }

        System.out.println();
        System.out.println("quartos ocupados");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }

}