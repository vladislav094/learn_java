package exceptions;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {   // проконтролировать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено.");
        } catch (ArithmeticException e) {
            // перехватить ошибку деления на нуль.
            System.out.println("Деление на нулью");
            System.out.println("Исключение " + e);
        }
        System.out.println("После оператора catch.");

    }
}
