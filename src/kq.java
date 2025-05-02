package leetcode;
import java.util.Arrays;
public class kq {
public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 1. Transpose
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }
        // 2. Rotate 90 degrees clockwise
        int[][] rotate90 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotate90[i][j] = a[3 - j - 1][i];
            }
        }
    System.out.println("-----");
    for (int i = 0; i < rotate90.length; i++) {
        for (int j = 0; j < rotate90[i].length; j++) {
            System.out.print(rotate90[i][j] + " ");
        }
        System.out.println(); // 줄바꿈
    }

        // 3. Row-wise sorting
        int[][] rowSorted = new int[3][3];
        for (int i = 0; i < 3; i++) {
            rowSorted[i] = Arrays.copyOf(a[i], 3);
            Arrays.sort(rowSorted[i]);
        }
    System.out.println("-----");
    for (int i = 0; i < rowSorted.length; i++) {
        for (int j = 0; j < rowSorted[i].length; j++) {
            System.out.print(rowSorted[i][j] + " ");
        }
        System.out.println(); // 줄바꿈
    }
        // 4. Diagonal sums
        int mainDiagonalSum = 0;
        int antiDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            mainDiagonalSum += a[i][i];
            antiDiagonalSum += a[i][2 - i];
        }
    System.out.println("주대각선 합 (Main Diagonal): " + mainDiagonalSum);
    System.out.println("부대각선 합 (Anti Diagonal): " + antiDiagonalSum);
        // 5. Spiral order
        int[] spiral = new int[9];
        int index = 0;
        int[][] b = Arrays.copyOf(a, a.length);
        int rowStart = 0, rowEnd = 2, colStart = 0, colEnd = 2;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) spiral[index++] = a[rowStart][i];
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) spiral[index++] = a[i][colEnd];
            colEnd--;
            for (int i = colEnd; i >= colStart; i--) spiral[index++] = a[rowEnd][i];
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) spiral[index++] = a[i][colStart];
            colStart++;
        }
    System.out.println("-----");
    for (int i = 0; i < transpose.length; i++) {
        for (int j = 0; j < transpose[i].length; j++) {
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println(); // 줄바꿈
    }
        // 6. Total, average, max, min
        int total = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int[] row : a) {
            for (int val : row) {
                total += val;
                if (val > max) max = val;
                if (val < min) min = val;
            }
        }
        double average = total / 9.0;
    System.out.println("-----");
    for (int i = 0; i < transpose.length; i++) {
        for (int j = 0; j < transpose[i].length; j++) {
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println(); // 줄바꿈
    }
        // 7. 2x2 uniform pattern check
        boolean hasPattern = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int val = a[i][j];
                if (val == a[i][j + 1] && val == a[i + 1][j] && val == a[i + 1][j + 1]) {
                    hasPattern = true;
                    break;
                }
            }
        }
    System.out.println("-----");
    for (int i = 0; i < transpose.length; i++) {
        for (int j = 0; j < transpose[i].length; j++) {
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println(); // 줄바꿈
    }
        // 8. Border highlight (set inner to -1)
        int[][] border = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 || i == 2 || j == 0 || j == 2) {
                    border[i][j] = a[i][j];
                } else {
                    border[i][j] = -1;
                }
            }
        }
    System.out.println("-----");
    for (int i = 0; i < transpose.length; i++) {
        for (int j = 0; j < transpose[i].length; j++) {
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println(); // 줄바꿈
    }
        // Print Results
        System.out.println("Transpose: " + Arrays.deepToString(transpose));
        System.out.println("Rotate 90: " + Arrays.deepToString(rotate90));
        System.out.println("Row Sorted: " + Arrays.deepToString(rowSorted));
        System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
        System.out.println("Anti Diagonal Sum: " + antiDiagonalSum);
        System.out.println("Spiral: " + Arrays.toString(spiral));
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Has 2x2 Uniform Pattern: " + hasPattern);
        System.out.println("Border Highlighted: " + Arrays.deepToString(border));
    }
}