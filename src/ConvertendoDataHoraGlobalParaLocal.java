import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDataHoraGlobalParaLocal {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-10-11");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-15T16:30:25");
        Instant d06 = Instant.parse("2023-10-15T01:30:25Z");

        /* CONVERTER UMA DATA GLOBAL PARA UMA DATA LOCAL */
        /* CONVERTER PARA UMA VARIAVEL DO TIPO LocalDate COM BASE NO TIMEZONE  */
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // TRAS O HORARIO AUTOMATICAMENTE COM BASE EM LONDERES
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // TRAS O HORARIO QUE VOCE DESEJA COM BASE EM LONDERES
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = [" + r1 +  "]"); // O HORARIO SERÁ 3H A MENOS POR CONTA DO TIMEZONE COM BASE EM LONDRES
        System.out.println("r2 = [" + r2 +  "]");
        System.out.println("r3 = [" + r3 +  "]");
        System.out.println("r4 = [" + r4 +  "]");
        System.out.println();

        /* OBTENDO HORARIO E DATA LOCAL INDIVIDUALMENTE USANDO get */
        System.out.println("d04 dia = [" + d04.getDayOfMonth() +  "]");
        System.out.println("d04 mês = [" + d04.getMonthValue() +  "]");
        System.out.println("d04 ano = [" + d04.getYear() +  "]");
        System.out.println();

        System.out.println("d05 hora = [" + d05.getHour() +  "]");
        System.out.println("d05 min = [" + d05.getMinute() +  "]");

        /* ESSE COMANDO IMPROME O NOME DE TODOS OS PAISES COM FUSO HORARIO  */
        /*for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }*/
    }
}
