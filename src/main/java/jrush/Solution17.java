package jrush;

public class Solution17 {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int[][] array: multiArray) {
            for (int[] array2: array){
                for (int elt: array2){
                    System.out.print(elt+ " ");
                }
                System.out.println();
            }
        }

    }
}
