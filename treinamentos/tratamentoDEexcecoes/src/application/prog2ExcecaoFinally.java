package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prog2ExcecaoFinally {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\kaion\\Documents\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {  //O bloco finally serve para ser executado independentimente se os outros executarem ou não
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }

    }

}
