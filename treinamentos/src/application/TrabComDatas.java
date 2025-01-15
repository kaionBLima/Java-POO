package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TrabComDatas {

    public static void main (String[] arg){

        LocalDate D01 = LocalDate.now(); // Chamar a data de hoje
        System.out.println("D01 = " + D01);

        LocalDateTime D02 = LocalDateTime.now(); // Chamar a data e hora de hoje
        System.out.println("D02 = " + D02);

        Instant D03 = Instant.now(); // Chamar data e hora de acordo com a linha de Greenwich (GMT)
        System.out.println("D03 = " + D03);


    }

}
