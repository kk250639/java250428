package ch05.exercise;

public class exercise08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int totalSum = 0;
        int totalStudent = 0;
        double avg = 0.0;
        for (int i = 0; i < array.length; i++) {
            totalSum = array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];
            }
            System.out.println("totalSum = " + totalSum);
//            System.out.println("totalavg = "
        }

    }
}