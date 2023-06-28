package jrush;

import java.util.*;

public class Solution54 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
//        addStudents();
//        System.out.println("Список студентов группы: ");
//        printStudents();
//        System.out.print("Средний балл группы: " + getAverageMark());
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Серега", 21);
        map.put("Николай", 22);
        map.put("Иван Петрович", 48);
        map.put("Анюта", null);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> pair: entries)
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " --> " + value);
        }
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        //напишите тут ваш код
        for (String elt: grades.keySet()) {
            System.out.println(elt);
        }
    }

    public static Double getAverageMark() {
        //напишите тут ваш код
        double sum = 0;
        for (double elt: grades.values()){
            sum += elt;
        }
        return sum/grades.size();
    }
}
