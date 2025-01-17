package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversãoDatHorParaString {

    public static void main (String[] args) {

        LocalDate D01 = LocalDate.parse("2025-05-28");
        LocalDateTime D02 = LocalDateTime.parse("2025-05-28T01:30:26");
        Instant D03 = Instant.parse("2025-05-28T03:15:40Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("D01 = " + D01.format(fmt1)); //Imprimir em String respeitando o formato do format
        System.out.println(("D01 segunda forma = " + fmt1.format(D01)));
    }
}
