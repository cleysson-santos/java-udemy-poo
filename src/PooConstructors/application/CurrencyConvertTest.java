package PooConstructors.application;

import PooConstructors.util.CurrencyConvert;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.printf("Hot many dollars will be bought? ");
        double quantity = sc.nextDouble();
        double converted = CurrencyConvert.convert(dollarPrice, quantity);
        System.out.printf("Amount to be paid in reais =  %.2f%n", converted);

        sc.close();
    }
}
