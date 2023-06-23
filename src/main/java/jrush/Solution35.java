package jrush;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution35 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        int count = query.split(delimiter).length;
        int ind = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] result= new String[count];
        while (stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            result[ind] = token;
            ind++;
        }
        return result;
    }
}
