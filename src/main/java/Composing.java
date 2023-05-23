import java.util.Arrays;

public class Composing {
    public static String compose(String s1, String s2) {
        String[] tab1 = s1.split("\n");
        String[] tab2 = s2.split("\n");
        String s="";

        for(int i=0;i<tab1.length;i++)
        {
            s = s + tab1[i].substring(0,i+1) + tab2[tab1.length-1-i].substring(0,tab1.length-i)+"\n";
        }
        s = s.substring(0,s.length()-1);
        return s;
    }

    public static void main(String[] args) {
        String arr1 = "abcd\nefgh\nijkl\nmnop";
        String arr2 = "qrst\nuvwx\nyz12\n3456";
        System.out.println(compose(arr1, arr2));
        System.out.println(compose("byGt\nhTts\nRTFF\nCnnI", "jIRl\nViBu\nrWOb\nNkTB"));
    }
}
