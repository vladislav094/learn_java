import java.util.Arrays;

public class Exercise {
    public static void main(String args[]) {
        double[] array1 = new double[12];
        double array2[] = new double[12];
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = new int[5];
        for (int x = 0; x < arr4.length; x++) {
            arr4[x] = x + 1;
        }
        System.out.println(Arrays.toString(arr4));

        double[] someDouble = new double[10];
        double summa = 0;
        for(int x = 0; x < someDouble.length; x ++) {
            someDouble[x] = x + 1 * 4;
            summa += someDouble[x];
        }
        System.out.println(Arrays.toString(someDouble));
        System.out.println(summa / someDouble.length);

        int x, y;
        x = 0;
        y = x < 0 ? 10: 20;
        System.out.println(y);


    }
}
