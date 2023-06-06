package enums;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;

        System.out.println("All constants apples an their ordinal values: ");
        for (Apple a: Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " before " + ap2);
        }

        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " before " + ap);
        }

        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " equals " + ap3);
        }
    }
}
