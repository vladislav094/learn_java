import java.util.Arrays;

class Person {
    final String name;    // team memnber's name
    final int happiness;  // happiness rating out of 10

    public Person(String name, int happiness) {
        this.name = name;
        this.happiness = happiness;
    }
}

public class TheOffice {
    public static String outed(Person[] meet, String boss) {
        for (Person x: meet) {
            if(x.name.equals(boss)) {
                System.out.println(x.happiness);
                if(x.happiness <= 5) {
                    System.out.println("Get");
                    return "Get Out Now!";
                }
                else {
                    System.out.println("Nice");
                    return "Nice Work Champ!";
                }
            }
            if(boss.equals("boss")) {
                int t = x.happiness * 2;
                if(t <= 5) {
                    System.out.println("Get");
                    return "Get Out Now!";
                }
                else {
                    System.out.println("Nice");
                    return "Nice Work Champ!";
                }
            }

        }
        return "What should I do?";
    }

    public static void main(String[] args) {
        Person[] meet = new Person[] {
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)
        };
        TheOffice.outed(meet, "boss");
    }
}
