package debug;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Жук");
        dog.run();
        Dog dog1 = new Dog("Жук 2");
        dog1.run();

    }
}
class Dog {
    private String name;
    private Foot foot;

    {
        name = "";
        foot = new Foot();
        System.out.println("Создан объект Foot");
    }
    Dog() {}

    Dog(String name) {
        this.name = name;
    }

    void run() {
        foot.run();
    }

    class Foot {
        String name = "Foot";
        void run() {
            System.out.println("Собака " + Dog.this.name + " бежит...");
        }
    }
}
