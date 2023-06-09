package lambdas;
import java.lang.Math;
public class FirstLambdas {
    public static void main(String[] args) {
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