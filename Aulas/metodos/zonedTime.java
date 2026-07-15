import java.time.Clock;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class horas {
    public static String Time(){
        ZonedDateTime timeNow = ZonedDateTime.now();

        //Formata o horário para o padrão Hora: Minuto : Segundo
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horsCurrent = timeNow.format(formatter);

        return horsCurrent;
    }

    public static void message(String hoursCurrent){
        ZonedDateTime timeNow = ZonedDateTime.now();

        int hoursNow = timeNow.getHour();

        if(hoursNow >= 5 && hoursNow < 12){
            System.out.println("Bom dia!!!");
            System.out.println("Agora são: " + hoursCurrent);
        } else if(hoursNow >= 12 && hoursNow < 18){
            System.out.println("Boa tarde!!!");
            System.out.println("Agora são: " + hoursCurrent);
        } else if(hoursNow >= 18 && hoursNow <= 23){
            System.out.println("Boa Noite!!!");
            System.out.println("Agora são: " + hoursCurrent);
        } else if(hoursNow >= 0 && hoursNow < 5){
            System.out.println("Boa Madrugada!!!");
            System.out.println("Agora são: " + hoursCurrent);
        } else {
            System.out.println("Erro");
        }


    }



}

void main() {
    horas.message(horas.Time());
}
