package EnumeracoesComposicao.Exercicios.Exercicio03.Entities;

import EnumeracoesComposicao.Exercicios.Exercicio03.Entities.Enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> items = new ArrayList<OrderItem>();

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ORDER SUMMARY: ");
        stringBuilder.append("Order moment: ");
        stringBuilder.append(simpleDateFormat.format(moment) + "\n");
        stringBuilder.append("Order status: ");
        stringBuilder.append(status + "\n");
        stringBuilder.append("Client: ");
        stringBuilder.append(client + "\n");
        stringBuilder.append("Order items: \n");
        for(OrderItem item : items) {
            stringBuilder.append(item + "\n");
        }
        stringBuilder.append("Total price: $");
        stringBuilder.append(String.format("%.2f", total()));
        return stringBuilder.toString();
    }
}
