package enumeracoesEcomposicao;

import entities.enums.OrderStatus;
import entitiess.Order;
import java.util.Date;

public class ProgramEnum {

    public static void main (String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        //Conversão de String para enum

        OrderStatus os1 = OrderStatus.DELIVERED; // 1 = Faz a declaração do Status
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // 2 = Passa essa declaração com o nome dela
        System.out.println(os1);
        System.out.println(os2);

    }
}
