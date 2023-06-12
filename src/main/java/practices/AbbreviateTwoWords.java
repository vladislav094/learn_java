package practices;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] s = name.split(" ");
        String r = s[0].charAt(0)+ "." + s[1].charAt(0);
        return r.toUpperCase();
    }

    public static String binaryAddition(int a, int b){
        //your code here
        String s = Integer.toBinaryString(a + b);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(binaryAddition(5, 9));
    }
}
