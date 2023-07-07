package jrush;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.TreeSet;
import java.time.LocalDateTime;
public class Solution92 {
    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());

        globalTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(globalTime);
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
