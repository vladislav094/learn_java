package jrush;

public class Solution22 {
    public static void main(String[] args) {
        double[] number = {12742.0, 299792458.0, 238.0289, 0.085, 10000.0, 109.1678};

        for (int i = 0; i < number.length; i++) {
            double exp = Math.floor(Math.log10(number[i]));
            double mats = number[i] / Math.pow(10, exp);
            System.out.println(mats + " " + exp);
        }
        System.out.println(-100.0/0.0);
    }
}
