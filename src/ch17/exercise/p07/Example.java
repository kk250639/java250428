package ch17.exercise.p07;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("hong", "개발자"),
                new Member("kim", "디자이너"),
                new Member("shin", "개발자")
        );
        // 고전적 for문
        List<Member> devs = new ArrayList<>();
        for (Member member : list) {
            if(member.getJob().equals("developers")) {
                devs.add(member);
            }
        }
        for(Member member : devs) {
            System.out.println(member);
        }

        // Stream 사용
        list.stream()
                .filter(s->s.getJob().equals("developer"))
                .toList();

        devs.forEach(System.out::println);

//        Map<String, List<Member>> groupingMap = list.stream()


        System.out.println("[개발자]");

        System.out.println();

        System.out.println("[디자이너]");

    }
}
