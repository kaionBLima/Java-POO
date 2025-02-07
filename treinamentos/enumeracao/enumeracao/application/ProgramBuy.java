package application;

import entities.enums.OrderStatus;
import entitiess.ClientBuy;
import entitiess.OrderBuy;
import entitiess.OrderItemBuy;
import entitiess.ProductBuy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramBuy {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (dd/MM/yyyy): ");
        Date birthDate = sdf.parse(sc.next());

        ClientBuy client = new ClientBuy(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        OrderBuy order = new OrderBuy(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
            System.out.print("Enter #" + (i+1) + "item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            ProductBuy product = new ProductBuy(productName, productPrice);
            OrderItemBuy itb = new OrderItemBuy(quantity, productPrice, product);

            order.addItem(itb); //Adicionando item ao pedido
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
