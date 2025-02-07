package entitiess;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entitiess.OrderItemBuy;

public class OrderBuy {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;

    private ClientBuy client;

    private List<OrderItemBuy> orderItems = new ArrayList<OrderItemBuy>();

    public OrderBuy() {
    }

    public OrderBuy(Date moment, OrderStatus status, ClientBuy client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ClientBuy getClient() {
        return client;
    }

    public void setClient(ClientBuy client) {
        this.client = client;
    }

    public void addItem(OrderItemBuy item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItemBuy item) {
        orderItems.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItemBuy it : orderItems) {
            sum = sum + it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append("status: " + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItemBuy item : orderItems) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}

