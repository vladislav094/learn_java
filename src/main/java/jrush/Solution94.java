package jrush;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution94 {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy'г.' H'ч.'m'мин'");
        String text = dtf.format(localDateTime);
        System.out.printf(text);
    }
}
