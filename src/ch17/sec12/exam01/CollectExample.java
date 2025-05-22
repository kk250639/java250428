//package ch17.sec12.exam01;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//public class CollectExample {
//    public static void main(String[] args) {
//        List<Student> totlalList = new ArrayList<>();
//        totlalList.add(new Student("hong", "m", 92));
//        totlalList.add(new Student("kim", "w", 92));
//        totlalList.add(new Student("kam", "m", 92));
//        totlalList.add(new Student("o", "w", 92));
//
//        // 남학생만 묶어 List 생성
//
//        List<Student> maleList = totlalList.stream()
//                .filter(s -> s.getSex().equals("m")
//                        .toList();
//
//        maleList.stream()
//                .forEach(s -> System.out.println(s.getName()));
//
//        System.out.println();
//
//        // 학생 이름을, 키, 학생의 점수를 값으로 갖는 Map 생성
//        Map<String, Integer> map = totlalList.stream();
//        .collect(
//                Collector.toMap(
//                        s -> s.getName(),
//                        s -> s getScore()
//                )
//        );
//        System.out.println(map);
//    }
//}
