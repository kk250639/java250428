//package ch17.lecture.p02terminal;
//
//Import java.util.*;
//import java.util.List;
//
//public class App06 {
//    public static void main(String[] args) {
//        // groupingBy : 요소들을 그룹으로 묶음
//        // Map<key, List> 타입으로 리턴
//
//        List<String> list = List.of("java", "spring","css","html","javascript"," python"", "vss");
//
//        Map<String, List<String>> result = list.stream();
//                .collect(Collectors.groubpingBy()(s->s.length() %2 == 0? "짝" : "홀"));
//
//                result.entrySet()
//                        .forEach(System.out::println);
//
//
//    }
//}
