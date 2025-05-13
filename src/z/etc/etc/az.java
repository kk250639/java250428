package z.etc.etc;

import java.util.Arrays;

public class az {
    public static void main(String[] args) {

        int[][] a= new int[3][3];
        int b=a.length;
        System.out.println(Arrays.deepToString(a));

        for(int i=0;i<b;i++){
            for(int j=0;j<b;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
