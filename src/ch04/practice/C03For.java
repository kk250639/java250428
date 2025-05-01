package ch04.practice;

public class C03For {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****
         */
        for (int z = 0; z < 5; z++) {
            for (int x = 0; x < (z + 1); x++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *****
         ****
         ***
         **
         *
         */
        for (int c = 6; c > 1; c--) {
            for (int v = 0; v < (c - 1); v++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        *****
        ****#
        ***##
        **###
        *####
        #####
         */

        for (int a = 1; a <= 6; a++) {
            for (int s = 1; s <= (6 - a); s++) {
                System.out.print("*");
            }
            for (int d = 1; d < a; d++) {
                System.out.print("#");
            }
            System.out.println();
        }
        /*
        1
        23
        456
        7890
        12345
        */
        int num = 1; // 출력할 숫자 시작값

        for (int i = 1; i <= 5; i++) { // 5줄
            for (int j = 1; j <= i; j++) {
                System.out.print(num % 10); // 10이 되면 0으로 출력됨
                num++;
            }
            System.out.println(); // 줄바꿈
        }
    }
}