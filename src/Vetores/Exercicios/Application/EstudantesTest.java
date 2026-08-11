package Vetores.Exercicios.Application;

import Vetores.Exercicios.Entities.Estudantes;

import java.util.Locale;
import java.util.Scanner;

public class EstudantesTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudantes[] rooms = new Estudantes[10];

        System.out.print("How many rooms will be rented? ");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ": ");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new Estudantes(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length ; i++) {
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }
}
