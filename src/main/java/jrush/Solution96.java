package jrush;

import java.util.ArrayList;

/*
Космическая одиссея ч.1
*/

public class Solution96 {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew() {
        //напишите тут ваш код
        astronauts.add(new Cat());
        astronauts.add(new Dog());
        astronauts.add(new Human());
        astronauts.add(new Human());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}

class Dog extends Astronaut{
    public String getInfo() {
        return "Собака";
    }
}

class Human extends Astronaut{
    public String getInfo() {
        return "Человек";
    }
}

class Cat extends Astronaut{
    public String getInfo() {
        return "Кот";
    }
}

class Astronaut {
    public String getInfo() {
        return "Неизвестный астронавт";
    }
}
