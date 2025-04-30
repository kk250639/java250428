package ch04.Exercise;

public class Exercise01 {
    public static void main(String[] args) {
        String grade = "B";

        int score1 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> score1 = 60;
        };
        System.out.println("점수: " + score1);
    }
}
