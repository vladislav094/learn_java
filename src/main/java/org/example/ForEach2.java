package org.example;

public class ForEach2 {
    public static void main(String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];
        String abc;
        for(int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        for(int x[]: nums){
            for(int y: x){
            System.out.println("Value: " + y);
            sum += y;
            }
        }
        System.out.println(sum);

        String str = new String("HelloMotherfucker");
        abc = str.substring(1, 4);
        System.out.println(abc);
    }
}
