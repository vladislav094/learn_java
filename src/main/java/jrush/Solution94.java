package jrush;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;

public class Solution94 {
    static LocalDateTime localDateTime = LocalDateTime.now();
    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy'г.' H'ч.'m'мин'");
        String text = dtf.format(localDateTime);
        System.out.println(text);

        DateTimeFormatter zdt = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n\nVV");
        String s = zdt.format(zonedDateTime);
        System.out.println(s);


    }
}
