//package ch17.sec11;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class ReductionExample {
//    public static void main(String[] args) {
//        List<Student> studentList = Arrays.asList(
//                new Student("홍길동", 92),
//                new Student("신용권", 95),
//                new Student("감자바", 88)
//        );
//        // 방법1
//
////
////        // 방법2
////        int sum2 = studentList.stream()
////                .map(Student::getScore)
////                .reduce(0, (a, b) -> a + b);
//
//        Integer r2 = list.stream()
//                .map(Student::getScore)
//                .reduce(0, Integer::sum);
//        System.out.println("r2 = " + r2);
//
//        int sum1 = studentList.stream()
//                .mapToInt(Student::getScore)
//                .sum();
//        System.out.println("r1 = " + r1);
//
//        System.out.println("sum1 = " + sum1);
//        System.out.println("sum2 = " + sum2);
//
//    }
//}
