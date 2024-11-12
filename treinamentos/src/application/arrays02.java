package application;

import java.util.Locale;
import java.util.Scanner;
import entities.arrays02APP;

public class arrays02 {
  ;      public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            arrays02APP[] vect = new arrays02APP[n];

            for(int i = 0; i< vect.length; i++) { /*Vect.legth é usado como substituto de
             n, deixando o cód. mais coeso, pois agora o próprio vetor sabe seu tamanho*/
                sc.nextLine();
                String name = sc.nextLine();
                double price = sc.nextDouble();
                vect[i] = new arrays02APP(name, price); /*estamos basicamente "apontando"
                                                         passando valor por referência em vetor*/
            }

            double sum = 0.0;
            for (int i = 0; i<vect.length; i++) {
                sum += vect[i].getPrice(); //pegando o vetor na posição i preço e fazendo a soma
            }
            double avg = sum / vect.length;

            System.out.printf("Preço médio dos produtos: %.2f%n", avg);

            sc.close();
    }
}
