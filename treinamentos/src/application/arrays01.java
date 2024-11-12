package application;

import java.util.Scanner;
import java.util.Locale;

public class arrays01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
        }

        double som = 0.0;
        for(int i = 0; i<n; i++) {
            som += vect[i];
        }
        double avg = som / n;

        System.out.printf("Média de soma de valores de array = %.2f%n", avg);

        sc.close();

    }

}
