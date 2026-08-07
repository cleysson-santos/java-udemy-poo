package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class RadiusTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double circumference = Calculator.circumference(radius);

        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}
