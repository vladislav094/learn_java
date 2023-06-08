package generics;
class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for(int i =0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Average iob = " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double x = dob.average();
        System.out.println("Average dob = " + x);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double f = fob.average();
        System.out.println("Average fob = " + f);

        System.out.println("AVG values iob and dob");
        if (iob.sameAvg(dob)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        System.out.println();

        System.out.println("AVG values iob and fob");
        if (iob.sameAvg(fob)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
    }
}
