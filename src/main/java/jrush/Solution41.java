package jrush;

public class Solution41 {
    public static void main(String[] args) {
        String string = "12.84";
        //напишите тут ваш код
        double d = Double.parseDouble(string);
        int i = (int) Math.round(d);
        System.out.println(i);
    }
}
