package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
//        Person person1 = new Person("Bob", 1);
//        Person person2 = new Person("Tom", 2);
        Person[] people = {new Person("Bob", 1), new Person("Tom", 2), new Person("Mike", 3)};

        try {
            FileOutputStream fos = new FileOutputStream("/home/vladislav/IdeaProjects/learn_java/src/main/java/serialization/person.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
//            outputStream.writeObject(person1);
//            outputStream.writeObject(person2);
//            outputStream.writeInt(people.length);

            //            for (Person person : people) {
//                outputStream.writeObject(person);
//            }
            outputStream.writeObject(people);

            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
