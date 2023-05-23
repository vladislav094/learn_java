import java.util.Arrays;

public class Composing {
    public static String compose(String s1, String s2) {
        String[] firstString = s1.split("\n");
        String[] secodString = s2.split("\n");
        StringBuilder[] resultString = new StringBuilder[firstString.length];
        StringBuilder[] resultString_2 = new StringBuilder[secodString.length];
        StringBuilder[] generalString = new StringBuilder[resultString.length];
        S
        for( int i = 0; i < firstString.length; i++) {
            resultString[i] = new StringBuilder();
            String t = firstString[i].substring(0, i+1);
            resultString[i].append(t);
        }
        for(int j = secodString.length - 1; j >= 0; j--) {
            int index = (secodString.length - j) -1;
//            System.out.println(index);
            resultString_2[index] = new StringBuilder();
            StringBuilder y = new StringBuilder(secodString[j]);
//            System.out.println(y.substring(0, j+1));
            resultString_2[index].append(y.substring(0, j+1));
        }
        for (int k = 0; k < generalString.length; k++) {
            generalString[k] = new StringBuilder();
            generalString[k].append(resultString[k].append(resultString_2[k]));
//            System.out.println(Arrays.toString(generalString));
            System.out.println(Arrays.toString(resultString));
        }
        return generalString;
    }

    public static void main(String[] args) {
        String arr1 = "abcd\nefgh\nijkl\nmnop";
        String arr2 = "qrst\nuvwx\nyz12\n3456";
        compose(arr1, arr2);
    }
}
