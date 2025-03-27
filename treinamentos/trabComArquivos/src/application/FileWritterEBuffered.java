package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterEBuffered {

    //FileWrither para criar arquivos e escrever neees

    public static void main(String[] args) {

        String[] lines = new String[] {"Goof Morning", "Good afternoon", "Good evening"};

        String path = "C:\\Users\\kaion\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //True -> Não recria o arquivo, apenas acrescentaU
                                            // primeiro comando digitado (bw) Cria arquivos de forma mais rápida que o FileWriter
            for(String line : lines) {
                bw.write(line);
                bw.newLine(); //Quebra de linha
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
