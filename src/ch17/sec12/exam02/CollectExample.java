//package ch17.sec12.exam02;
//
//import java.util.ArrayList;
//import java.util.*;
//
//public class CollectExample {
//    public static void main(String[] args) {
//        List<Student> totalList = new ArrayList<>();
//        totalList.add(new Student("hong", "m", 92));
//        totalList.add(new Student("kim", "w", 87));
//        totalList.add(new Student("kam", "m", 95));
//        totalList.add(new Student("o", "w", 93));
//
//        Map<String, List<student>> map = totalList.stream()
//                .collect(
//                        Collectors.grooupingBy(s -> s.getSex())
//                );
//        List<Student> maleList = map.get("m");
//        maleList.stream().forEach(s -> System.out.println(s.getName()));
//        System.out.println();
//
//        List<Student> femaleList = map.get("w");
//        femaleList.stream().froEach(s -> System.out.println(s.getName)));
//    }
//}
