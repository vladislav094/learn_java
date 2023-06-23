package jrush;

public class Solution30 {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        int temp = 0;
        int result = 0;
        if (decimalNumber <= 0) {
            return 0;
        } else {
            while (decimalNumber != 0) {
                result = result + (decimalNumber % 8) * (int) Math.pow(10, temp);
                decimalNumber = decimalNumber / 8;
                temp++;
            }
            return result;
        }
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int tempt = 0;
        int result = 0;
        if (octalNumber <= 0) return 0;
        else {
            while (octalNumber != 0) {
                result = result + ( octalNumber % 10) * (int) Math.pow(8, tempt);
                octalNumber = octalNumber / 10;
                tempt++;
            }
            return result;
        }
    }
}
