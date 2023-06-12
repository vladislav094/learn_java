package practices;

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
        double total = 0;
        String answer = "";
        for (Person x: meet) {
            double t = x.happiness;
            if(x.name.equals(boss)) {
                t = t * 2;
            }
            total += t;

        }
        total = (int) Math.round(total);
        answer = ((total / meet.length) <= 5) ? "Get Out Now!" : "Nice Work Champ!";
        return answer;
    }

    public static void main(String[] args) {
        Person[] meet = new Person[] {
                new Person("tim", 1),
                new Person("jim", 3),
                new Person("randy", 9),
                new Person("sandy", 6),
                new Person("andy", 7),
                new Person("katie", 6),
                new Person("laura", 9),
                new Person("saajid", 9),
                new Person("alex", 9),
                new Person("john", 9),
                new Person("mr", 8)
        };
        TheOffice.outed(meet, "katie");
    }
}
