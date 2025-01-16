package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TrabComDatas {

    public static void main (String[] arg){

        /* Link de conversão de data e hora:
         https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html */

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); /* ofPattern -> Met. padrão para conversão, indicando o
        formato dentro do parênteses*/
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate D01 = LocalDate.now(); // Chamar a data de hoje
        System.out.println("D01 = " + D01);

        LocalDateTime D02 = LocalDateTime.now(); // Chamar a data e hora de hoje
        System.out.println("D02 = " + D02);

        Instant D03 = Instant.now(); // Chamar data e hora de acordo com a linha de Greenwich (GMT)
        System.out.println("D03 = " + D03);

        LocalDate D04 = LocalDate.parse("2022-07-20"); // Imprimir data e hora (mesmo não tendo a hora, ele imprime) que digitou
        System.out.println("D04 = " + D04.toString()); //Precisa usar 'toString' para esse formato

        LocalDateTime D05 = LocalDateTime.parse("2022-07-20T01:30:06");
        System.out.println("D05 = " + D05.toString());

        Instant D06 = Instant.parse("2025-01-15T23:10:26Z");
        System.out.println("D06 = " + D06.toString());

        LocalDate D07 = LocalDate.parse("15/08/2025", fmt1);
        System.out.println("D07 = " + D07.toString());

        LocalDateTime D08 = LocalDateTime.parse("15/08/2025 01:30", fmt2);
        System.out.println("D08 = " + D08.toString());

        LocalDate D09 = LocalDate.of(2022, 07, 20); //Imprimir ano,  mes e dia, só que digitando-os separadamente
        System.out.println("D09 = " + D09);

    }

}
