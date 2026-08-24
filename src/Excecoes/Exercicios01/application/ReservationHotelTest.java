package Excecoes.Exercicios01.application;

import Excecoes.Exercicios01.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReservationHotelTest {
    static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = simpleDateFormat.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = simpleDateFormat.parse(sc.next());

        if(!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = simpleDateFormat.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = simpleDateFormat.parse(sc.next());

            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Erroe in reservation: Reservation dates for update must be future dates!");
            } else if(!checkOut.after(checkIn)){
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }

        }


        sc.close();
    }
}
