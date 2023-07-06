package jrush;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Solution85 {
    static Date birthDate = new Date(100, 3, 17);
    ;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String result = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.forLanguageTag("ru"));
        return result;
    }
}
