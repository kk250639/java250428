package ch05.Lecture;

import java.util.Arrays;

public class C18Copy {
    public static void main(String[] args) {
        int[][] a = {{9,3}, {5,7,10}};
        int[][] b = a; // 참조값 복사
        int[][] c = {a[0],a[1]}; // 원소(item)의 참조값 복사
        int[][] d = {{a[0][0],a[0][1]},{a[1][0],a[1][1],a[1][2]}};

        a[0][0] = 99;
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(d[0]));

        int[][] e = new int[a.length][];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<a[i].length;j++){
                e[i][j] = a[i][j];
            }
        }
        System.out.println("e[0] = " + Arrays.toString(e[0]));
        System.out.println("e[1] = " + Arrays.toString(e[1]));
        e[0][0] = 999;
        System.out.println("e[0] = " + Arrays.toString(e[0]));
        System.out.println("e[1] = " + Arrays.toString(e[1]));
    }
}
