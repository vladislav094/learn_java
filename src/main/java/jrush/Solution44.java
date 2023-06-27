package jrush;

import java.util.ArrayList;

public class Solution44 {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Фриле");
    }

    public static void paySalary(String name) {
        //напишите тут ваш код
        if (name == null) return;
        for (int i =0; i < waitingEmployees.size(); i++) {
            if (name.equals(waitingEmployees.get(i))){
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(i, null);
            }
        }
    }
}
