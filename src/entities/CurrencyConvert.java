package entities;

public class CurrencyConvert {
    public static final double IOF = 0.06;

    public static double convert(double dollarPrice, double quantity) {
        double total = dollarPrice * quantity;
        return total + (total * IOF);
    }
}
