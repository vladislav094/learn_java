package jrush;

public class Solution42 {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
        int total = 0;
        for(int i = 0; i < string.length(); i++){
            if (Character.isDigit(string.charAt(i))) {
                total +=1;
            }
        }
        return total;
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        int total = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                total +=1;
            }
        }
        return total;
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        int total = 0;
        for (int i =0; i < string.length(); i++) {
            if (Character.isWhitespace(string.charAt(i))){
                total +=1;
            }
        }
        return total;
    }

}
