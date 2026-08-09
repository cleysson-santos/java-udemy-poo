package Vetores.Exercicios.Application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        double soma, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        numero = sc.nextInt();

        double[] vector = new double[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextDouble();
        }

        soma = 0;

        for (int i = 0; i < numero; i++) {
            soma += vector[i];
        }

        media = soma / numero;

        System.out.println();
        System.out.print("VALORES = ");

        for (int i = 0; i < numero; i++) {
            System.out.printf("%.1f ", vector[i]);
        }

        System.out.println();
        System.out.printf("SOMA = %.1f ", soma);
        System.out.println();
        System.out.printf("MEDIA = %.1f ", media);

        sc.close();
    }
}
