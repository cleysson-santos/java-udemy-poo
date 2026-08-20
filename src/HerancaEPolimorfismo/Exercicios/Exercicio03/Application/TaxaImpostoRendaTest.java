package HerancaEPolimorfismo.Exercicios.Exercicio03.Application;

import HerancaEPolimorfismo.Exercicios.Exercicio03.Entities.PessoaFisica;
import HerancaEPolimorfismo.Exercicios.Exercicio03.Entities.PessoaJuridica;
import HerancaEPolimorfismo.Exercicios.Exercicio03.Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TaxaImpostoRendaTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.print("Enter the number of tax payers: ");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char response = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double anualIncome = sc.nextDouble();

            if(response == 'i'){
                System.out.print("Health expenses: ");
                double healthExpenses = sc.nextDouble();

                list.add(new PessoaFisica(name, anualIncome, healthExpenses));
            } else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();

                list.add(new PessoaJuridica(name, anualIncome, numberEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");

        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }

        double sum = 0.0;
        for (TaxPayer tp : list) {
            sum += tp.tax();
        }

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
