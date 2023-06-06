package enums;

enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Constants enum type Apple:");
        Apple allapples[] = Apple.values();
        for(Apple a: allapples) {
            System.out.println(a);
        }

        ap = Apple.valueOf("Winesap");
        System.out.println("Variable ap given " + ap);

        ap = Apple.RedDel;

        System.out.println("Value ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if(ap == Apple.GoldenDel)
            System.out.println("Variable ap given GoldenDel.\n");

        switch (ap) {
            case Jonathan:
                System.out.println("Sort Jonathan red.");
                break;
            case GoldenDel:
                System.out.println("Sort Gold Delicious yellow.");
                break;
            case RedDel:
                System.out.println("Sort Red Delicious red.");
                break;
            case Winesap:
                System.out.println("Sort Winesap red.");
                break;
            case Cortland:
                System.out.println("Sort Cortland red.");
                break;

        }
    }
}
