import java.util.Arrays;
import java.util.Objects;

public class Kata3 {
    public static String removeConsecutiveDuplicates(String s){
        String[] str = s.split(" ");
        StringBuilder strBuild = new StringBuilder();
        String preWord = "";
        for(String each: str){
            System.out.println(each+ " " + preWord);
            if(!each.equals(preWord)){
                strBuild.append(each).append(" ");
                preWord = each;
            }
        }
        System.out.println(strBuild.toString().trim());
        return strBuild.toString().trim();
    }

    public static void main(String[] args) {
        String s = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        System.out.println(removeConsecutiveDuplicates(s));
    }
}
