package Interface.Exercicio02.Application;

import Interface.Exercicio02.Entities.Contract;
import Interface.Exercicio02.Entities.Installment;
import Interface.Exercicio02.Model.Services.ContractService;
import Interface.Exercicio02.Model.Services.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class PaymentSystemTest {
    static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), formatter);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int quantity = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, quantity);

        System.out.println("Parcelas: ");
        for(Installment installment : contract.getInstalments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
