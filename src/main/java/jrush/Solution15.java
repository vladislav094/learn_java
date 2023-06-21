package jrush;

public class Solution15 {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i < result.length+1; i++) {
            result[i-1] = new int[i];
        }

        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
            }
        }

        for (int[] elt: result) {
            for (int item: elt) {
                System.out.print(item+ " ");
            }
            System.out.println();
        }
    }
}
