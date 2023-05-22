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

    public static void main(String[] args) {
        OutOfSpace.spacey(array);
    }
}
