package Interface.Application;

import Interface.Entities.CarRental;
import Interface.Entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CarRentalTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), formatter);
        System.out.println("Retorno (dd/MM/yyyy hh:mm");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), formatter);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        sc.close();
    }
}
