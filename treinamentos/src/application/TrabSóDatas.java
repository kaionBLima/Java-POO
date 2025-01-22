package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class TrabSóDatas {

    public static void main (String[] args) throws ParseException {

        SimpleDateFormat sfd1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sfd2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis()); //Imprimir a ora atual do meu computador

        Date y1 = sfd1.parse("25/06/2018");
        Date y2 = sfd2.parse("25/06/2018 15:20:44");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //Data será imprimida no padrão UTC

        System.out.println("X1 = " + sfd2.format(x1));
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2 );
        System.out.println("y1 = " + sfd2.format(y1));
        System.out.println("y2 = " + sfd2.format(y2));
        System.out.println("y3 = " + sfd2.format(y3));

    }
}
