package dataEhora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TrabDateCalender {

    public static void main (String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2022-08-25T15:22:22Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance(); //Instanciando calender
        cal.setTime(d); //Data instanciada nesse calendario criado
        cal.add(Calendar.HOUR_OF_DAY, 4); //Adicionando mais 4 horas na data registrada no calendario
        d = cal.getTime();

        System.out.println("4 horas adicionadas = " + sdf.format(d));

        //Agora quero saber em qual minuto, hora, dia ou meses estava a data no devido momento em que foi registrada...

        int minutes = cal.get(Calendar.MINUTE);
        int hous = cal.get(Calendar.HOUR_OF_DAY);
        int month = 1 + cal.get(Calendar.MONTH); //Adicionei 1 para contar o mes certo, pois o resultado será 0 - o primeiro digito do mês.
        System.out.println("Minuto do registro da data = " + minutes);
        System.out.println("Hora do registro da data = " + hous);
        System.out.println("Mês do registro da data = " + month);
    }
}
