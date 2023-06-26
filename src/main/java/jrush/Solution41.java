package jrush;

public class Solution41 {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Solution41.Calculator.add(a, b);
        Solution41.Calculator.subtract(a, b);
        Solution41.Calculator.multiply(a, b);
        Solution41.Calculator.divide(a, b);
    }
    static class Calculator{
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + Solution41.EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + Solution41.EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + Solution41.EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + Solution41.EQUAL + (a / b));
        }
    }
}
