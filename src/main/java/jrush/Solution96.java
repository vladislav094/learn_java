package jrush;

import java.util.ArrayList;

/*
Космическая одиссея ч.1
*/

public class Solution96 {
//    public static ArrayList<Astronaut> astronauts = new ArrayList<>();
//
//    public static void main(String[] args) {
//        createCrew();
//        printCrewInfo();
//        runWorkingProcess();
//    }
//
//    public static void runWorkingProcess() {
//        //напишите тут ваш код
//        Human h1 = (Human) astronauts.get(0);
//        Human h2 = (Human) astronauts.get(1);
//        Dog dog = (Dog) astronauts.get(2);
//        Cat cat = (Cat) astronauts.get(3);
//        pilot(h1);
//        pilot(h2);
//        createDirection(dog);
//        research(cat);
//    }
//
//    public static void pilot(Human human){
//        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
//    }
//
//    public static void createDirection(Dog dog){
//        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
//    }
//
//    public static void research(Cat cat){
//        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
//    }

//    public static void createCrew() {
//        astronauts.add(new Human());
//        astronauts.add(new Human());
//        astronauts.add(new Dog());
//        astronauts.add(new Cat());
//    }
//
//    public static void printCrewInfo() {
//        System.out.println("На борт погружены члены экипажа: ");
//        for (Astronaut astronaut : astronauts) {
//            System.out.println(astronaut.getInfo());
//        }
//    }

    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        //напишите тут ваш код
        for (var elt: astronauts) {
            if (elt instanceof Human) {
                pilot((Human) elt);
            } else if (elt instanceof Dog) {
                createDirection((Dog) elt);
            } else if (elt instanceof Cat) {
                research((Cat) elt);
            }
        }
    }

    public static void pilot(Human human) {
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog dog) {
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat cat) {
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
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
