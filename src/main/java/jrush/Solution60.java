package jrush;

public class Solution60 {
    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString;
        switch (monthIndex) {
            case 1:
                return "Январь";
//            break;
            case 2:
                return "Февраль";
//            break;
            case 3:
                return "Март";
//            break;
            case 4:
                return "Апрель";
            case 5:
                return "Май";
            case 6:
                return "Июнь";
//            break;
            case 7:
                return "Июль";
//            break;
            case 8:
                return "Август";
//            break;
            case 9:
                return "Сентябрь";
//            break;
            case 10:
                return "Октябрь";
//            break;
            case 11:
                return "Ноябрь";
//            break;
            case 12:
                return "Декабрь";
            default:
                return "Недействительный месяц";
//            break;
        }

    }
}
