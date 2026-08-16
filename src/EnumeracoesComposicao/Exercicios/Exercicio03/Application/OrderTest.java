package EnumeracoesComposicao.Exercicios.Exercicio03.Application;

import EnumeracoesComposicao.Exercicios.Exercicio03.Entities.Client;
import EnumeracoesComposicao.Exercicios.Exercicio03.Entities.Enums.OrderStatus;
import EnumeracoesComposicao.Exercicios.Exercicio03.Entities.Order;
import EnumeracoesComposicao.Exercicios.Exercicio03.Entities.OrderItem;
import EnumeracoesComposicao.Exercicios.Exercicio03.Entities.Product;
import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class OrderTest {
    static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = simpleDateFormat.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        Integer quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer itemQuantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(itemQuantity, productPrice, product);

            order.addItem(item);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
