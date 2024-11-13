package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

    public static void main(String[] arg) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.printf("Valores: ");
        for(int i=0; i<n; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        double soma = 0.0;
        for (int i = 0; i<n; i++) {
            soma += vect[i];
        }
        System.out.printf("\nSoma: %.1f", soma);

        double media = soma / n;
        System.out.printf("\nMédia = %.1f%n", media);

        sc.close();
    }
}
