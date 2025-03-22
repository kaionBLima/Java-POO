package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//ABRINDO MANUALMENTE O ARQUIVO, DA FORMA MAIS DIFIÍCIL
public class FileBufferedReader {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\kaion\\arq1.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine(); //Leitura de arquivo

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}
