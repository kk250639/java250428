package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };
        System.out.println("반의수 = " + scores.length);
        System.out.println("1반의학생수 = " + scores[0].length);
        System.out.println("2반의학생수 = " + scores[1].length);

        // 1반의 평균
        int sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            sum += scores[0][i];
        }
        System.out.println("1반 점수 합 = " + sum);
        double avg = (double) sum / scores[0].length;
        System.out.println("1반 평균 점수 = " + avg);


        // 2반의 평균
        sum = 0;
        avg = 0.0;
        for (int i = 0; i < scores[1].length; i++) {
            sum += scores[1][i];
        }
        System.out.println("2반 점수 합 = " + sum);
        avg = (double) sum / scores[1].length;
        System.out.println("2반 평균 점수 = " + avg);

        sum = 0;
        avg = 0.0;
        int studentsNum = 0;
        // 전체 학생의 점수 합, 평균
        for (int i = 0; i < scores.length; i++) {
            studentsNum += scores[i].length;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
        }
        avg = (double) sum / studentsNum;
        System.out.println("총점수 = " + sum);
        System.out.println("평균점수 = " + avg);

    }
}
