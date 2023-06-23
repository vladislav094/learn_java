package jrush;

public class Solution36 {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут . Я буду зарабатывать $ в месяц.";
        //напишите тут ваш код
        return String.format("Меня зовут %s. Я буду зарабатывать %d $ в месяц.", name, salary );
    }
}
