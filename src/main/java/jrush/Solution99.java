package jrush;

<<<<<<< HEAD
import java.util.ArrayList;

interface Voice {
    public void voice();
}
public class Solution99 {
    public static void main(String[] args) {
        ArrayList pets = new ArrayList();
        pets.add(new Cats());
        pets.add(new Dogs());

        for (Object pet: pets) {
            if (pet instanceof Voice) {
                Voice scream = (Voice) pet;
                scream.voice();
            }
        }
    }
}

class Dogs implements Voice {

    public void voice(){
        System.out.println("GAF");
    }
}
class Cats implements Voice {

    public void voice(){
        System.out.println("Miy");
    }
}
=======
public class Solution99 {
    //    public static void main(String[] args) {
//        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
//        Stream<Integer> stream2 = Stream.of(10, 11, 12, 13, 14);
////        Stream<Integer> result = Stream.concat(stream1, stream2);
////        System.out.println(result.collect(Collectors.toList()));
//
//        stream1.peek(System.out::println);
//    }
    public static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.println(this.name + " I'am - Animal");
        }

        public void sayMiu(){
            System.out.println(this.name + " say ABRAKADABRA");
        }
    }

    public static class Cat extends Animal {
        private String name;
        private int age;
        public Cat(String name) {
            super(name);
        }

        public void sayHello() {
            System.out.println(super.name + " I'am - Cat");
        }

        public void sayMiu(){
            System.out.println(super.name + " say Miu");
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("amnimal");
        Cat c1 = new Cat("cat");
        Animal c2 = new Cat("cat 2");

        a1.sayHello();
        c1.sayHello();
        c1.sayMiu();
        c2.sayMiu();
    }
}
>>>>>>> 5741a16dbff6b9adb386bbedb0e8ccbfd5814e5d
