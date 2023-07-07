package jrush;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

public class Solution92 {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишите тут ваш код
        TreeSet<String> result = new TreeSet<>();
        for (String s: ZoneId.getAvailableZoneIds()) {
            result.add(s);
        }
        return result;
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишите тут ваш код

        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }
}
