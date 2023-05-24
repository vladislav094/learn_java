import java.util.Arrays;

public class Composing {
    public static String compose(String s1, String s2) {
        String[] str1 = s1.split("\n");
        String[] str2 = s2.split("\n");
        String s = "";
        for (int i = 0; i < str1.length; i++) {
            s = s + str1[i].substring(0, i+1) + str2[str1.length - 1 - i].substring(0, str1.length-i) + "\n";
        }
        return s.substring(0, s.length()-1);
    }

    public static void main(String[] args) {
        String arr1 = "abcd\nefgh\nijkl\nmnop";
        String arr2 = "qrst\nuvwx\nyz12\n3456";
//        compose(arr1, arr2);
        System.out.println(compose(arr1, arr2));
        System.out.println();
        System.out.println(compose("byGt\nhTts\nRTFF\nCnnI", "jIRl\nViBu\nrWOb\nNkTB"));
    }
}
