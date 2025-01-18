package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConversãoDatHorParaString {

    public static void main (String[] args) {

        LocalDate D01 = LocalDate.parse("2025-05-28");
        LocalDateTime D02 = LocalDateTime.parse("2025-05-28T01:30:26");
        Instant D03 = Instant.parse("2025-05-28T03:15:40Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        /* Para transmormar o tipo Instant para string é preciso indicar a zona do fuso horário - withZone -, nesse
         caso estou usando o do meu computador - ZoneId.systemDefault */
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // Outra forma de imprimir data e hora em string, existem mais formatos  no site


        System.out.println("D01 = " + D01.format(fmt1)); //Imprimir em String respeitando o formato do format
        System.out.println(("D01 segunda forma = " + fmt1.format(D01))); // Segunda forma
        System.out.println("D03 terceira forma = " + D01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Terceira forma

        System.out.println("D04 = " + fmt2.format(D02));
        System.out.println("D05 = " + fmt3.format(D03));
        System.out.println("D06 (formato ISO) = " + fmt4.format(D02));
    }
}
