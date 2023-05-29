package Interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        Animal animal = new Animal(2);
        Person person = new Person("Jack");
//        info1.showInfo();
//        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);
        System.out.println();
        outputInfo(animal);
        outputInfo(person);

    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
