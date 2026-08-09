package Vetores.Exercicios.Application;

import java.util.Scanner;

public class ExercicioNegativosTest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Quantos numeros voce vai digitar?");
            numero = sc.nextInt();

            if(numero > 10 || numero < 0){
                System.out.println("Digite um número entre 1 a 10");
            }
        } while (numero > 10 || numero < 0);

        int[] vector = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < numero; i++) {
            if(vector[i] < 0){
                System.out.println(vector[i]);
            }
        }

        sc.close();
    }
}
