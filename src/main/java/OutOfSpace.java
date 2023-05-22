import java.util.Arrays;

public class OutOfSpace {
    static String[] array = new String[]{"kevin", "has", "no", "space"};
    public static String[] spacey(String[] array) {
        // TODO: Figure it out :)
        String[] expected = new String[array.length];
        String staticWord = "";
        for (int i = 0; i < array.length; i ++) {
            staticWord += array[i];
            expected[i] = staticWord;
        }
        return expected;
    }

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.isEmpty()) return null;
//        if (phrase == null) return null;
        else {
        String [] chars = phrase.split(" ");
        String[] result = new String[chars.length];
        for (int i = 0; i < chars.length; i ++) {
            String str = chars[i].substring(0, 1).toUpperCase() + chars[i].substring(1);
            result[i] = str;
        }
        String r = String.join(" ", result);
        System.out.println(r);
        return null;
        }
    }

    public static String disemvowel(String str) {
        String vowels = "aqeuioAQEUIO";
        String result = "";
        for( int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            if(vowels.indexOf(t) != -1) {
                result += "";
            }
            else {
                result += t;
            }
        }
        System.out.println(result);
        return result;
    }

    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] result = new String[n];
        for(int i = 0; i < n; i++) {
            result[i] = i % 2 == 0 ? firstValue : secondValue;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        OutOfSpace.toJadenCase("Must return null when the arg is null");
        OutOfSpace.toJadenCase("");
        OutOfSpace.toJadenCase(null);
//        disemvowel("This website is for losers LOL!");
        disemvowel("No offense but,\nYour writing is among the worst I've ever read");
        disemvowel("What are you, a communist?");
        alternate(5, "true", "false");
        alternate(20, "blue", "red");
    }
}
