package application;

import java.io.File;
import java.util.Scanner;

//Informações do caminho de arquivo

public class InfoCaminhoArquiv {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getname: " + path.getName()); //Imprime o nome do camnho
        System.out.println("getParent" + path.getParent()); //Caminho sem o nome do arquivo
        System.out.println("getPath: " + path.getPath()); // Imprime o caminho por compaminhowqsa

        sc.close();
    }
}
