package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed form stock: ");
        quantity = sc.nextInt();
        product.removeProducts((quantity));

        System.out.println();
        System.out.println("Product data: " + product);

        sc.close();
    }
}
