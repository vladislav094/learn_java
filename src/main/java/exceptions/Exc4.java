package exceptions;

public class Exc4 {
    public static void main(String[] args) {
        // Проверяемые исключения = исключительные случаи в работе программы
        // Непроверяемые исключения = ошибка в работе программы

//        int a = 1 / 0;

//        String name = null;
//        name.length();
        try {
            int[] arr = new int[2];
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }
        System.out.println("After exception");
//        System.out.println(arr[2]);

    }
}
