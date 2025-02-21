package application;

import java.util.Scanner;

public class prog1Excecao {
    public static void main (String[] args) {

        /* Para encontrar as excecoes que devem ser escritas no bloco "try", executa-se o programa e aplique a
        execeção/erro que queira que o compilador retorne dando o nome dessa execessao, em seguida use-a no bloco
        "Catch". */

        method1();
        System.out.println("The end program!");

    }

    public static void method1() {
        System.out.println("**** METHOD1 START ****");
        method2();
        System.out.println("*** END METHOD1");
    }

    public static void method2() {
        System.out.println("**** METHOD2 START ****");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) { //Testando exceção da posição que não existe no vetor
            System.out.println("Invalid position");
            e.printStackTrace(); /*Pilha de chamada de métodos que vai ser mostrado na tela a ordem de cada
            chamada na piha, mas sem parar o programa */
            sc.next();
        } catch (java.util.InputMismatchException x) {
            System.out.println("Input error");
        }
        System.out.println("*** END METHOD2");
        sc.close();
    }
}
