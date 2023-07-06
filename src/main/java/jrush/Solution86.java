package jrush;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution86 {
//    static Calendar birthDate = new GregorianCalendar(1992, 2, 01);
//
//    public static void main(String[] args) {
//        System.out.println(getDayOfWeek(birthDate));
//    }
//
//    static String getDayOfWeek(Calendar calendar) {
//        //напишите тут ваш код
//        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.forLanguageTag("ru")));
//        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.forLanguageTag("ru"));
//    }

    public static final String INVENTED = "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!";
    public static final String NOT_INVENTED = "Извините, телепорт еще не изобрели, приходите через 10 лет.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        //напишите тут ваш код
        while (!isTeleportInvented(currentDay)) {
            currentDay.add(Calendar.YEAR, 10);
        }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        //напишите тут ваш код
        Date current = currentDay.getTime();
        Date invention = INVENTION_DAY.getTime();
        if (current.after(invention)) {
            System.out.println(INVENTED);
            return true;
        } else {
            System.out.println(NOT_INVENTED);
        }
        return false;
    }

}
