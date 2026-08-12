package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraTest {
    static void main(String[] args) {

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2026-08-11");
        LocalDateTime d05 = LocalDateTime.parse("2026-08-11T02:30");
        Instant d06 = Instant.parse("2026-08-11T02:30:20Z");
        Instant d061 = Instant.parse("2026-08-11T02:30:20-03:00");

        LocalDate d07 = LocalDate.parse("12/08/2026", formato1);
        LocalDateTime d08 = LocalDateTime.parse("12/08/2026 01:30", formato2);

        LocalDate d09 = LocalDate.of(2026, 8, 12);
        LocalDateTime d10 = LocalDateTime.of(2026, 8, 12, 01, 30);


        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d061 = " + d061.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
    }
}
