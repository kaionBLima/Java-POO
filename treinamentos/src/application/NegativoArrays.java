package application;

import java.util.Scanner;
import java.util.Locale;

public class NegativoArrays {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0; i<vect.length; i++) {
            System.out.printf("digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos:");

        for (int i=0; i<vect.length; i++){
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close();

    }

}
