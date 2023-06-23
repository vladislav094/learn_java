package jrush;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Solution27 {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        //напишите тут ваш код
        String[] arr = {CERTAIN, DEFINITELY, MOST_LIKELY, OUTLOOK_GOOD, ASK_AGAIN_LATER, TRY_AGAIN, NO, VERY_DOUBTFUL};
        Random r = new Random();
        int value = r.nextInt(7) ;
        return arr[value];
    }

    public static void main(String[] args) throws InterruptedException {
//        getPrediction();
//        printNumbers();
        int x = 7;
//        x = x & 25;
//        System.out.println(x);
        x = x & 5;
        System.out.println(x);
//        x = x & 3;
        System.out.println(x);
        x = x & 12;
        System.out.println(x);
        x = x | 1;
        System.out.println(x);
        System.out.println(16>>2);
    }

    public static void printNumbers() throws InterruptedException {
        //напишите тут ваш код
        for (int i =1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1, 300000);
        }

    }
}
