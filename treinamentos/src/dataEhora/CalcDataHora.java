package dataEhora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcDataHora {

    public static void main (String[] args) {

        LocalDate D01 = LocalDate.parse("2025-05-28");
        LocalDateTime D02 = LocalDateTime.parse("2025-05-28T23:30:26");
        Instant D03 = Instant.parse("2025-05-28T02:15:40Z");

        //Somando e subtraindo horas, dias, semanas, meses e anos
        LocalDate pastWeekLDate = D01.minusDays(7);
        LocalDate nextWeek = D01.plusDays(7);

        System.out.println("current week = " + D01 + "\n" +
                "past week = " + pastWeekLDate + "\n"
                + "next Week = " + nextWeek);

        LocalDateTime pastWeekLDTime = D02.minusWeeks(2);
        LocalDateTime nextWeekLDTime = D02.minusMinutes(60);

        System.out.println("past week LDTime = " + pastWeekLDTime + "\n" +
                "next week LDTime = " + nextWeekLDTime);

        //No instant é diferente, pois é preciso mais especificações
        Instant pastWeekInstant = D03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = D03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant + "\n"
                            + "nextWeekInstant = " + nextWeekInstant);

        //Duração entre datas
        Duration t1 = Duration.between(pastWeekLDTime, D02);
        //Duração entre datas com o tipo DateTime modificado, pois não há suporte para DT original
        Duration t2 = Duration.between(pastWeekLDate.atStartOfDay(), D01.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, D03);

        System.out.println("t1 = " + t1.toDays());
        System.out.println("t2 = " + t2.toDays());
        System.out.println("t3 = " + t3.toDays());
    }
}
