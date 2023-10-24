import java.sql.SQLOutput;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {
    public static void main(String[] args) {

        /*
        DATA HORA SÃO OBJETOS IMUTAVEIS
        UMA VEZ QUE INSTANCIA UMA DATA,
        HORA DE UM DIA ANTEIROR POR EXEMPLO,
        VOCÊ NÃO VAI LA DENTRO E MUDA O
        ESTADO DELE. DEVE-SE CRIAR OUTRO
        OBJETO ALTERADO
        */

        LocalDate d04 = LocalDate.parse("2023-10-11");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-15T16:30:25");
        Instant d06 = Instant.parse("2023-10-15T01:30:25Z");

        /* CALCULOS COM DATA E HORA */

        LocalDate semanaAnteriorLocalDate = d04.minusDays(7);
        LocalDate proximoDiaLocalDate = d04.plusDays(7);

        System.out.println();
        System.out.println("semanaAnteriorLocalDate = [" + semanaAnteriorLocalDate + "]");
        System.out.println("proximoDiaLocalDate = [" + proximoDiaLocalDate + "]");

        LocalDateTime semanaAnteriorLocalDateTime = d05.minusDays(7);
        LocalDateTime proximoDiaLocalDateTime = d05.plusDays(7);

        System.out.println();
        System.out.println("semanaAnteriorLocalDateTime = [" + semanaAnteriorLocalDateTime + "]");
        System.out.println("proximoDiaLocalDateTime = [" + proximoDiaLocalDateTime + "]");

        Instant semanaAnteriorInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant proximoDiaInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("semanaAnteriorInstant = [" + semanaAnteriorInstant + "]");
        System.out.println("proximoDiaInstant = [" + proximoDiaInstant + "]");

        /* CALCULOS COM DATA E HORA */

        // DURAÇÃO ENTRE DUAS DATA-HORA
        Duration t1 = Duration.between(semanaAnteriorLocalDateTime, d05);
        System.out.println();
        System.out.println("t1 dias = [" + t1.toDays() + "]");

        // NÃO É POSSSIVEL FAZER O CALCULO DE LOCALDATE SEM USAR OS METODOS .atTime(0, 0) OU atStartOfDay()
        //Duration t2 = Duration.between(semanaAnteriorLocalDate.atTime(0, 0), d04.atTime(0, 0));
        Duration t2 = Duration.between(semanaAnteriorLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("t1 dias = [" + t2.toDays() + "]");

        Duration t3 = Duration.between(semanaAnteriorInstant, d06);
        Duration t4 = Duration.between(d06, semanaAnteriorInstant);
        System.out.println();
        System.out.println("t3 dias = [" + t3.toDays() + "]");
        System.out.println("t4 dias = [" + t4.toDays() + "]");
    }
}
