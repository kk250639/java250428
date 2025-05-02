package ch05.Lecture;

public class C14Matrix {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[4];
        a[1] = new int[4];
        a[2] = new int[4];

        // 행과 열 갯수 한번에 정의
        int[][] b = new int[3][4];
        b[0][0] = 99;
        b[0][1] = 99;
        b[0][2] = 99;
        b[0][3] = 99;

        b[1][0] = 93;
        b[1][1] = 93;
        b[1][2] = 93;
        b[1][3] = 93;

        b[2][0] = 95;
        b[2][1] = 95;
        b[2][2] = 95;
        b[2][3] = 95;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("b[" + i + "]=" + b[i][j]);
            }
            System.out.println();
        }

        int[][] e = new int[3][];
        e[0] = new int[4];
        e[1] = new int[3];
        e[2] = new int[5];

        e[0][0] = 3;
        e[0][1] = 1;
        e[0][2] = 6;
        e[0][3] = 8;

        e[1][0] = 4;
        e[1][1] = 3;
        e[1][2] = 2;

        e[2][0] = 5;
        e[2][1] = 7;
        e[2][2] = 9;
        e[2][3] = 4;
        e[2][4] = 8;

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                System.out.println("e[" + i + "]=" + e[i][j]);
            }
            System.out.println();
        }
        int[][] d = new int[3][];
        d[0] = new int[]{9, 8, 7, 6};
        d[1] = new int[]{5, 4, 3};
        d[2] = new int[]{2, 1, 0, -1, -2};

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.println("d[" + i + "]=" + d[i][j]);
            }
            System.out.println();
        }
    }
}
