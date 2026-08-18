package HerancaEPolimorfismo.Exercicios.Exercicio02.Application;

import HerancaEPolimorfismo.Exercicios.Exercicio02.Entities.ImportedProduct;
import HerancaEPolimorfismo.Exercicios.Exercicio02.Entities.Product;
import HerancaEPolimorfismo.Exercicios.Exercicio02.Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ProductTest {
    static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Product # " + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char question = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if(question == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();

                list.add(new ImportedProduct(name, price, customsFee));
            } else if(question == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                list.add(new UsedProduct(name, price, date));
            } else {
                list.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}
