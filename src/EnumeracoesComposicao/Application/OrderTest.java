package EnumeracoesComposicao.Application;

import EnumeracoesComposicao.Entities.Order;
import EnumeracoesComposicao.Enums.OrderStatus;
import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class OrderTest {
    static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }



}
