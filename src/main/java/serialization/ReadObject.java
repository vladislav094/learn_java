package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/home/vladislav/IdeaProjects/learn_java/src/main/java/serialization/person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);

//            int personCount = objectInputStream.readInt();
//            Person[] people = new Person[personCount];

//            for (int i = 0; i < personCount; i++) {
//                Person person = (Person) objectInputStream.readObject();
//                people[i] = person;
//            }
//            Person person1 = (Person) objectInputStream.readObject();
//            Person person2 = (Person) objectInputStream.readObject();
//            System.out.println(person1);
//            System.out.println(person2);

        Person[] people = (Person[]) objectInputStream.readObject();

        System.out.println(Arrays.toString(people));
        objectInputStream.close();

    }
}
