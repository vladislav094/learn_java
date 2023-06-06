package enums;

enum Apples {
    Jonathan(10), GoldenDel(9), RedDel(1), Winesap(15), Cortland(20);

    private int price;

    Apples(int p) {
        price = p;
    }

    Apples() {
        price = -2;
    }

    int getPrice(){
        return price;
    }
}
public class EnumDemo3 {
    public static void main(String[] args) {

        Apples ap;

//        System.out.println("Apple sort of Winesap cost " + Apples.Winesap.getPrice());

        ap = Apples.Winesap;

        System.out.println(ap.compareTo(Apples.Cortland));
    }
}
