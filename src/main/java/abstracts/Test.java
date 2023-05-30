package abstracts;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
//    Animal animal = new Animal(); // Это абстрактный класс. Недоступен для создания объектов
        cat.makeSound();
        dog.makeSound();
    }
}
