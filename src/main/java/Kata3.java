import java.util.Arrays;
import java.util.Objects;

public class Kata3 {
    public static String removeConsecutiveDuplicates(String s){
        //solution
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];
        System.out.println(Arrays.toString(arr));
        result[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(!arr[i].equals(result[i-1])) {
                System.out.println(i);
                System.arraycopy();
            }
        }
        System.out.println(Arrays.toString(arr));
        return " ";
    }

    public static void main(String[] args) {
        String s = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        System.out.println(removeConsecutiveDuplicates(s));
    }
}
