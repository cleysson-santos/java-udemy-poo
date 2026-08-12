package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraConvertTextTest {
    static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-08-11");
        LocalDateTime d05 = LocalDateTime.parse("2026-08-11T02:30");
        Instant d06 = Instant.parse("2026-08-11T02:30:20Z");

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d04 = " + d04.format(formato1));
        System.out.println("d04 = " + formato1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(formato1));
        System.out.println("d05 = " + d05.format(formato2));

        System.out.println("d06 = " + formato3.format(d06));
    }
}
