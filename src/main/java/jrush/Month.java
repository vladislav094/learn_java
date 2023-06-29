package jrush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Months[] arr = values();
    public static Months[] getWinterMonths(){
        return new Months[]{arr[11], arr[0], arr[1]};
    }

}
public class Month {
    public static void main(String[] args) {
        System.out.println(Months.getWinterMonths().toString());
    }
    private final int value;

    public static final Month JANUARY = new Month(0);
    public static final Month FEBRUARY = new Month(1);
    public static final Month MARCH = new Month(2);
    public static final Month APRIL = new Month(3);
    public static final Month MAY = new Month(4);
    public static final Month JUNE = new Month(5);
    public static final Month JULY = new Month(6);
    public static final Month AUGUST = new Month(7);
    public static final Month SEPTEMBER = new Month(8);
    public static final Month OCTOBER = new Month(9);
    public static final Month NOVEMBER = new Month(10);
    public static final Month DECEMBER = new Month(11);

    private Month(int value){
        this.value = value;
    }

    private static final Month[] array = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};


    public int ordinal(){
        return this.value;
    }
    public static Month[] values(){
        return array;
    }
}
