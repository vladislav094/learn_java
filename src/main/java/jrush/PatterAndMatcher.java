package jrush;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatterAndMatcher {
        public static void main(String[] args) {
            String str = "Hello 123 world 456";
            Pattern pattern = Pattern.compile("\\d+"); // "\\d+" соответствует одной или более цифрам
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                System.out.println(matcher.group()); // Выводит найденное число
            }
        }
    }
}
