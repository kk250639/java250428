package ch05.sec07;

public class MultedimensionalArrayByNewExample {
    public static void main(String[] args) {

        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {
            for (int k = 0; k < mathScores[i].length; k++) {
                System.out.println("mathScores[" + i + "][" + k + "]:" + mathScores[i][k]);
            }
        }
        mathScores[0][0] = 80;
        mathScores[0][1] = 80;
        mathScores[0][2] = 80;

        mathScores[1][0] = 80;
        mathScores[1][1] = 80;
        mathScores[1][2] = 80;

        int totalStudent = 0;
        int totalMathSum = 0;

        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) {
                totalStudent += mathScores[i][j];
            }
        }

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[0] = new int[2];
        englishScores[0] = new int[2];
        englishScores[0] = new int[2];
        englishScores[0] = new int[2];
//        englishScores[0] = new int)
    }
}
