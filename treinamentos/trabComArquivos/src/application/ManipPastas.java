package application;

import java.io.File;
import java.util.Scanner;

public class ManipPastas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory); // ->Função criada para percorrer pastas do diretório desejado
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); // ->Função que percorre arquivos da pasta/diretório desejado
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(files);
        }

        // CRIANDO SUB PASTA A PARTIR DA PASTA

        boolean sucess = new File(strPath + "\\SubFolder").mkdir();
        System.out.println("Directory created sucessfully: " + sucess);

        sc.close();
    }
}
