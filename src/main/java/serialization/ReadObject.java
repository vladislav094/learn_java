package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws Exception{
            FileInputStream fis = new FileInputStream("/home/vladislav/IdeaProjects/learn_java/src/main/java/serialization/person.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);

            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
            System.out.println(person1);
            System.out.println(person2);

            objectInputStream.close();

    }
}
