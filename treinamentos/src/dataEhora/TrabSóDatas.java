package dataEhora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class TrabSóDatas {

    public static void main (String[] args) throws ParseException {

        SimpleDateFormat sfd1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sfd2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sfd3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sfd3.setTimeZone(TimeZone.getTimeZone("GMT")); /* Imprimir Formato UTC (Tempo Universal Coordenado) é o padrão de tempo
                                                            utilizado em todo o mundo) Ele é usado para controlar o tempo em serviços
                                                            como meteorologia aeronáutica e controle de tráfego aéreo*/

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis()); //Imprimir a ora atual do meu computador
        Date X3 = new Date(1000L * 60L * 60L * 5L);

        Date y1 = sfd1.parse("25/06/2018");
        Date y2 = sfd2.parse("25/06/2018 15:20:44");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //Data será imprimida no padrão UTC

        System.out.println("3 horas adiantado conforme o formato UTC: ");
        System.out.println("X1 = " + sfd3.format(x1));
        System.out.println("y1 = " + sfd3.format(y1));
        System.out.println("y2 = " + sfd3.format(y2));
        System.out.println("y3 = " + sfd3.format(y3));
        System.out.println("------------------------------");
        System.out.println("X1 = " + sfd2.format(x1));
        System.out.println("y1 = " + sfd2.format(y1));
        System.out.println("y2 = " + sfd2.format(y2));
        System.out.println("y3 = " + sfd2.format(y3));
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
    }
}
