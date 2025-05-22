package ch17.exercise.p06;

import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("hong", 30),
                new Member("shin", 40),
                new Member("kam", 26)
        );
        // 고전적 for
        double sum = 0;
        for(Member member : list) {
            sum += member.getAge();
        }
        double avg = sum / list.size();
        System.out.println("avg = " + avg);

        // 참조타입 Stream
        Integer sum2 = list.stream()
                .map(Member::getAge)
                .reduce(0, Integer::sum);
        Double avg2 = sum2.doubleValue() / list.size();
        System.out.println("avg2 = " + avg2);
        // 기본타입 Stream
        double average = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .orElse(0.0);
        System.out.println("avg = " + avg);



    }
}
