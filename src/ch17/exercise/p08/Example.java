package ch17.exercise.p08;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("hong","개발자"),
                new Member("kim","디자이너"),
                new Member("shin","개발자")
        );

        Map<String, List<Member>> map = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));

        System.out.println("[[개발자]]");
        for (Member member : map.get("개발자")) {
            System.out.println(member);
        }

        System.out.println("[[디자이너]]");
        for (Member member : map.get("디자이너")) {
            System.out.println(member);
        }





//        Map<String, List<Member>> gorupingMap = list.stream()
//                        .collect(Collectors.groupingBy(s->s.length() %2 == 0 ? "개발자":"디자이너"));
//        System.out.println("[개발자]");
//
//        System.out.println();
//
//        System.out.println("[디자이너]");
    }
}
