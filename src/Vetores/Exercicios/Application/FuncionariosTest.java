package Vetores.Exercicios.Application;

import Vetores.Exercicios.Entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionariosTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1) + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(list,id)) {
                System.out.println("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Funcionarios(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Funcionarios employees = list.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
        if(employees == null) {
            System.out.println("This id doesn't exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employees.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Funcionarios employee : list) {
            System.out.println(employee);
        }

        sc.close();
    }

    public static boolean hasId(List<Funcionarios> list, int id) {
        Funcionarios employees = list.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
        return employees != null;
    }
}
