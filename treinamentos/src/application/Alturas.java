package application;

import java.util.Scanner;
import java.util.Locale;

public class Alturas {

    public static void main (String[] arg) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i=0; i<vect.length; i++) {
            System.out.printf("Dados da %d a pessoa: \n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        int menor = 0;
        double alturaTotal = 0.0;

        for(int i=0; i<vect.length; i++) {
            if (idade[i] < 16) {
                menor++;
            }
            alturaTotal += altura[i];
        }

        double alturaMedia = alturaTotal / n;
        double percentualAltura = ((double)menor / n) * 100;

        System.out.printf("\nAltura média: %.1f", alturaMedia);
        System.out.printf("\nPercentural de altura: %.1f%%", percentualAltura);

        for (int i=0; i< vect.length; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
            }
        }

        sc.close();
    }
}
