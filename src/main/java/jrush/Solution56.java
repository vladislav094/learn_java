package jrush;
import java.util.ArrayList;
import java.util.HashMap;
public class Solution56 {
    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        HashMap<Integer, String> result = new HashMap<>();
        for (String elt: programmingLanguages){
            int index = programmingLanguages.indexOf(elt);
            String value = elt;
            result.put(index, value);
        }

        System.out.println(result);
        return result;
    }
}
