package Vetores.Exercicios.Application;

import Vetores.Exercicios.Entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class AlunosTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos alunos serao digitados? ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Alunos[] alunos = new Alunos[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            String name = sc.nextLine();
            double notice1 = sc.nextDouble();
            double notice2 = sc.nextDouble();
            sc.nextLine();

            alunos[i] = new Alunos(name, notice1, notice2);
        }

        System.out.println();
        System.out.println("Alunos Aprovados: ");

        for (Alunos aluno : alunos) {
            if(aluno.isAprovate()) {
                System.out.println(aluno.getName());
            }
        }
        sc.close();
    }
}
