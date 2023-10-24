import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoUmDateComCalendar {
    public static void main(String[] args) {

        // Somando uma unidade de tempo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));

        // COMO REALIZAR A SOMA DE
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        d = cal.getTime();
        System.out.println(sdf.format(d));
        System.out.println();

        int horas = cal.get(Calendar.HOUR_OF_DAY);
        int minutos = cal.get(Calendar.MINUTE);
        int segundos = cal.get(Calendar.SECOND);

        // TEM QUE ACRESCENTAR 1 + cal.get(Calendar.MONTH);
        // O MES COMEÇA COM ZERO
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = 1 + cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);

        System.out.println("Horas = [" + horas + "]");
        System.out.println("Minutos = [" + minutos + "]");
        System.out.println("Segundos = [" + segundos + "]");
        // O QUE SERA ACRESCENTADO (DIA, MES, ANO, HORA, MINUTO, SEGUNDO)
        // NESTE CASO SERA ACRESCENTADO 4 HORAS NO DIA
        cal.add(Calendar.HOUR_OF_DAY, 4);

        System.out.println();
        System.out.println("Dia: [" + dia + "]");
        System.out.println("Mes: [" + mes + "]");
        System.out.println("Ano: [" + ano + "]");
    }
}
