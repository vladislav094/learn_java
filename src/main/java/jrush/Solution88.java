package jrush;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Solution88 {
    //    static LocalTime timeMax = LocalTime.MAX;
//    static LocalTime timeMin = LocalTime.MIN;
//    static LocalTime time1 = LocalTime.of(14, 0, 0);
//    static LocalTime time2 = LocalTime.of(7,0,8);
//    static LocalTime time3 = LocalTime.of(0, 45, 0, 61);
//    static LocalTime time4 = LocalTime.of(14, 0, 45, 1001);
//
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        LocalTime localTime = LocalTime.of(time1.getHour(), time2.getMinute(), time3.getSecond(), time4.getNano());
//        System.out.println(localTime);
//    }
//    public static void main(String[] args) throws InterruptedException {
//        LocalTime localTime = LocalTime.MIDNIGHT;
//        LocalTime next = amazingMethod(localTime);
//        while (next.isAfter(localTime)) {
//            System.out.println(next);
//            next = amazingMethod(next);
//            Thread.sleep(500);
//        }
//    }

//    static LocalTime amazingMethod(LocalTime base) {
//        return base.plusHours(19).plusMinutes(30);
//    }

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишите тут ваш код
        Set<LocalDateTime> result = new HashSet<>();
        for (Map.Entry<LocalDate, List<LocalTime>> entry: sourceMap.entrySet()){
            for (LocalTime time: entry.getValue()) {
                result.add(LocalDateTime.of(entry.getKey(), time));
            }
        }
        return result;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}
