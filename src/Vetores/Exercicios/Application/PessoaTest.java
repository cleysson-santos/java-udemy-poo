package Vetores.Exercicios.Application;

import Vetores.Exercicios.Entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class PessoaTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Pessoa[] people = new Pessoa[quantity];

        double heightSum = 0.0;
        int younger16 = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();

            people[i] = new Pessoa(name, age, height);

            heightSum += height;

            if(age < 16) {
                younger16++;
            }
        }

        double heightMedia = heightSum / quantity;
        double percentage = (double) younger16 / quantity * 100.0;

        System.out.printf("%nAltura média: %.2f%n", heightMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);

        for (Pessoa p : people) {
            if(p.getAge() < 16) {
                System.out.println(p.getName());
            }
        }

        sc.close();
    }
}
