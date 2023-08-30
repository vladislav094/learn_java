package serialization;

import java.io.Serializable;

public class Person implements Serializable {

    public String name;
    transient public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
