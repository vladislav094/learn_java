package jrush;

public class Solution29 {
    public static int setFlag(int number, int flagPos) {
        //напишите тут ваш код
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        //напишите тут ваш код
        return number & ~(1<<flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишите тут ваш код
        return (number &(1<<flagPos)) == (1 << flagPos);
    }
}
