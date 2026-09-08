package Interface.Exercicio02.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate date;
    private Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.date = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return date;
    }

    public void setDueDate(LocalDate dueDate) {
        this.date = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date.format(formatter) + " - " + String.format("%.2f", amount);
    }
}
