import java.util.Arrays;

public class Composing {
    public static String compose(String s1, String s2) {
        String[] firstString = s1.split("\n");
        String[] secondString = s2.split("\n");
        StringBuilder[] resultString = new StringBuilder[firstString.length];
        StringBuilder[] resultString_2 = new StringBuilder[secondString.length];
        StringBuilder[] generalString = new StringBuilder[resultString.length];
        for( int i = 0; i < firstString.length; i++) {
            resultString[i] = new StringBuilder();
            String t = firstString[i].substring(0, i+1);
            resultString[i].append(t);
        }
        for(int j = secondString.length - 1; j >= 0; j--) {
            int index = (secondString.length - j) -1;
            resultString_2[index] = new StringBuilder();
            StringBuilder y = new StringBuilder(secondString[j]);
            resultString_2[index].append(y.substring(0, j+1));
        }
        for (int k = 0; k < generalString.length; k++) {
            generalString[k] = new StringBuilder();
            String c = resultString[k].append(resultString_2[k]).toString();
            generalString[k].append(c);
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder sp: generalString){
            result.append(sp).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String arr1 = "abcd\nefgh\nijkl\nmnop";
        String arr2 = "qrst\nuvwx\nyz12\n3456";
        System.out.println(compose(arr1, arr2));
        System.out.println(compose("byGt\nhTts\nRTFF\nCnnI", "jIRl\nViBu\nrWOb\nNkTB"));
    }
}
