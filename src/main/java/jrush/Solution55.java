package jrush;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution55 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Кесарчук Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudentsInfo() {
        //напишите тут ваш код
        Set<Map.Entry<String, Double>> mySet = grades.entrySet();
        for (Map.Entry<String, Double> m : mySet){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        for (var entry: grades.entrySet()){
            System.out.print(entry.getKey());
            System.out.print(" : ");
            System.out.println(entry.getValue());
        }
    }
}
