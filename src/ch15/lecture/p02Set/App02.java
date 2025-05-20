package ch15.lecture.p02Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("spring");
        set.add("react");
        set.add("mysql");
        set.add("htm");

        // 전체탐색
        System.out.println("---enhanced for---");
        for(String item : set) {
            System.out.println(item);
        }

        // enhanced for
        System.out.println("---forEach---");
        set.forEach(e -> System.out.println(e));
//        set.forEach(System.out::println);

        // forEach
        System.out.println("---stream---");
        set.stream()
                .forEach(System.out::println);

        // stream
        System.out.println("---Iterator---");
        Iterator<String> iterator = set.iterator();
//        while (Iterator.hasNext ()) {
//            String item = iterator.next();
//            System.out.println(next);
//        }

        // Iterator

    }
}
