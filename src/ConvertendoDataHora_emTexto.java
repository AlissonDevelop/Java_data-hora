import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHora_emTexto {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-10-11");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-15T16:30:25");


        /* TAMBEM DEFINE COMO TRANSFORMAR A DATA E HORA EM UMA STRING */
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


        /* USADO PARA CONSIDERAR O FUSO HORARIO LOCAL */
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        Instant d06 = Instant.parse("2023-10-15T16:30:25Z");// PRECISA DA FORMATAÇÃO ACIMA


        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt4));

        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));
        System.out.println("d06 = " + d06.toString());

    }

}
