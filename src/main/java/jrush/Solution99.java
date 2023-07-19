package jrush;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution99 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(10, 11, 12, 13, 14);
//        Stream<Integer> result = Stream.concat(stream1, stream2);
//        System.out.println(result.collect(Collectors.toList()));

        stream1.peek(System.out::println);
    }
}
