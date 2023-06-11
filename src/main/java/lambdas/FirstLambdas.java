package lambdas;
import java.lang.Math;
import java.util.Arrays;

public class FirstLambdas {
    public static void main(String[] args) throws EmptyArrayException {
        MyNumber myNum;
        myNum = () -> 123.45;

        System.out.println(myNum.getValue());

        NumericTest isEven = n -> (n % 2) == 0;
        if (!isEven.test(19)) System.out.println("19 -- нечетное число");
        if (isEven.test(10)) System.out.println("10 -- четное число");

        NumericTest isNonNeg = n -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("1 -- неотрицательное число");
        if (!isNonNeg.test(-1)) System.out.println("-1 -- отрицательное число");

        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2)) System.out.println("2 является множителем 10");
        if (!isFactor.test(10, 3)) System.out.println("3 не является множителем 10");

        GenericFunc<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        GenericFunc<String> revers = n -> {
            String result = "";
            int i;
            for (i = n.length() -1; i >=0; i--)
                result += n.charAt(i);
            return result;
        };

        System.out.println("Factorial number 3 equals: " + factorial.func(5));
        System.out.println("Revers word - lambdas is: " + revers.func("lambdas"));

        String inStr = "Лямбда-выражение повышают эффективность Java";
        String outStr;
        System.out.println("Это исходная строка: " + inStr);
        outStr = LambdasAsArgumentsDemo.stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Это строка прописными буквами: " + outStr);

        outStr = LambdasAsArgumentsDemo.stringOp(n -> {
            String result = "";
            int i;
            for (i = 0; i < n.length(); i++)
                if (n.charAt(i) != ' ') result += n.charAt(i);
            return result;
        }, inStr);
        System.out.println("Это строка без пробелов: " + outStr);


        double[] values = {1.0, 2.0, 3.0, 4.0};

        DoubleNumericArrayFunc average = n -> {
            double sum = 0;
            if (n.length == 0)
                throw new EmptyArrayException();

            for (int i = 0; i < n.length; i++)
                sum += n[i];
            return sum / n.length;
        };

        System.out.println("Среденее значение жлементов массива Double[] = " + average.func(values));

        outStr = MethodRedDemo.stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);

    }

}

class LambdasAsArgumentsDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

}

class MyStringOps{
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

class MethodRedDemo {
    static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }
}

interface MyNumber {
    double getValue();
}

interface NumericTest {
    boolean test(int n);
}

interface NumericTest2 {
    boolean test(int n, int d);
}

/*Обощенный функциональный интерфейс. Позволяет избежать дублирование
 кода при использовании лямбда-выражений с параметрами различного типа.
 */
interface GenericFunc<T>{
    T func(T n);
}

interface StringFunc {
    String func(String n);
}

interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}