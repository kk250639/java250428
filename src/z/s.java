package z;

public class s {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };

        int[][] result = flipAndInvert(matrix);

        // 결과 출력
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvert(int[][] matrix) {
        int[][] result = new int[matrix.length][]; // 결과 배열 생성

        // 행을 좌우로 뒤집기
        for (int j = 0; j < matrix.length; j++) {
            int[] a = matrix[j];
            int[] b = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                b[i] = a[a.length - 1 - i]; // 뒤에서부터 복사 (좌우 반전)
            }
            result[j] = b;
        }

        // 반전: 0 → 1, 1 → 0
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;

    }

}

