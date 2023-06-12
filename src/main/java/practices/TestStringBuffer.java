package practices;

import java.util.Arrays;

public class TestStringBuffer {
    public static String greet(String name) {
        return ("Hello, " + name + " how are you doing today?");
    }

    public static char getGrade(int s1, int s2, int s3) {
        int total = (s1 + s2 + s3) / 3;
        char result ='1';
        if (total >= 90 & total <= 100) {
            result = 'A';
        }
        if (total >= 80 & total <= 90) {
            result = 'B';
        }
        if (total >= 70 & total <= 80) {
            result = 'C';
        }
        if (total >= 60 & total <= 70) {
            result = 'D';
        }
        if(total >=0 & total <= 60){
            result = 'F';
        }
        return result;
    }


    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        sb.append(new Integer(2));
//        sb.append("; ");sb.append(false);
//        sb.append("; ");
//        sb.append(Arrays.asList(1, 2, 3));
//        sb.append("; ");
//        System.out.println(sb);
        System.out.println(getGrade(65,70,59));
        int[][] array ={{3, 2, 1},
                        {6, 5, 4},
                        {9, 8, 7}};

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
