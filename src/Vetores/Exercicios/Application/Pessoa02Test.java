package Vetores.Exercicios.Application;

import Vetores.Exercicios.Entities.Pessoa02;

import java.util.Locale;
import java.util.Scanner;

public class Pessoa02Test {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoa voce vai digitar? ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Pessoa02[] people = new Pessoa02[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();
            sc.nextLine();

            people[i] = new Pessoa02(name, age);
        }

        Pessoa02 older = people[0];

        for (int i = 0; i < people.length; i++) {
            if(people[i].getAge() > older.getAge()){
                older = people[i];
            }
        }

        System.out.println();
        System.out.println("PESSOA MAIS VELHA: " + older.getName());

        sc.close();
    }
}
