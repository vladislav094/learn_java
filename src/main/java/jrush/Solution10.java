package jrush;

public class Solution10 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray = new int[firstArray.length + secondArray.length];

    public static void main(String[] args) {
        //напишите тут ваш код
        resultArray = new int[firstArray.length + secondArray.length];
        int pos = 0;
        for (int elt: firstArray) {
            resultArray[pos] = elt;
            pos++;
        }
        for (int elt: secondArray) {
            resultArray[pos] = elt;
            pos++;
        }


        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
