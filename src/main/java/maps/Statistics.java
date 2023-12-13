package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 1; i < 1000; i++) {
            int r = rand.nextInt(20);
            Integer fer = m.get(r);
//            System.out.println(fer);
            m.put(r, fer == null ? 1 : fer + 1);
        }
        System.out.println(m);
    }
}
