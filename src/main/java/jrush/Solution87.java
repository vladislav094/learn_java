package jrush;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Set;

public class Solution87 {
    public static void main(String[] args) {
        ZoneId timeZone = ZoneId.of("Europe/Moscow");
        Set<String> arr = ZoneId.getAvailableZoneIds();
//        for (String elt: arr) {
//            System.out.println(elt);
//        }
        LocalDate today = LocalDate.now(timeZone);
        System.out.println(today);
    }
}
