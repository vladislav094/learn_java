package practices;

import java.time.LocalDate;

public class DateDays {
    public static String dateNbDays(double a0, double a, double p) {
        LocalDate d = LocalDate.of(2016, 1, 1);
        while (a0 < a){
            a0 += a0 * (p / (360 * 100));
            d = d.plusDays(1);
        }
        return d.toString();
    }

    public static void main(String[] args) {
        System.out.println(dateNbDays(100, 101, 0.98));
//        System.out.println(dateNbDays(100, 150, 2.00));
    }
}
