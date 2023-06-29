package jrush;

public class Solution59 {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Mont.JANUARY));
        System.out.println(getNextMonth(Mont.JULY));
    }

    public static Mont getNextMonth(Mont month) {
        //напишите тут ваш код
        if(month.ordinal() == Mont.values().length-1) return Mont.values()[0];
        return Mont.values()[month.ordinal()+1];

    }

}
enum Mont {
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
    DECEMBER
}