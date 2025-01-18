package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvGlobalParaLocal {

    public static void main (String[] args) {

        LocalDate D01 = LocalDate.parse("2025-05-28");
        LocalDateTime D02 = LocalDateTime.parse("2025-05-28T23:30:26");
        Instant D03 = Instant.parse("2025-05-28T02:15:40Z");

        /*for (String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }*/

        LocalDate r1 = LocalDate.ofInstant(D03, ZoneId.systemDefault());
        // Imprimir na data local de acordo com meu pc, ela leva em conta o fuso horário
        LocalDate r2 = LocalDate.ofInstant(D03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(D03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(D03, ZoneId.of("Portugal"));

        System.out.println("r1 (D03) = " + r1);
        System.out.println("r2 (D03) de portugal = " + r2);
        System.out.println("r3 (D03) = " + r3);
        System.out.println("r4 (D03) de portugal = " + r4);

        //brincando com o ano, mês, dia, horário...
        System.out.println("D01 dia = " + D01.getDayOfMonth());
        System.out.println("D01 mês = " + D01.getMonth());
        System.out.println("D01 ano = " + D01.getYear());
        System.out.println("D02 horario = " + D02.getHour());

    }
}
