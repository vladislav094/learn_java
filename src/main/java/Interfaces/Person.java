package Interfaces;

public class Person implements Info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println(name + " Is name");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
