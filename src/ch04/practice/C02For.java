package ch04.practice;

public class C02For {
    public static void main(String[] args) {
        /*
         * 0
         * 1
         * 2
         * 3
         * 4
         * */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        /*
         * 1
         * 2
         * 3
         * 4
         * 5
         * */
        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }
        // 02468
        for (int z = 0; z <= 8; z++) {
            if (z % 2 == 0) {
                System.out.println(z);
            }
        }
        // 246810
        for (int x = 2; x <= 10; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
        //43218
        for (int c = 4; c >= 0; c--) {
            System.out.println(c);
        }
        // 54321
        for (int v = 5; v >= 1; v--) {
            System.out.println(v);
        }
        // *****
        for (int n = 0; n <= 5; n++) {
            System.out.println("*");
        }
        /*
         * *****
         * *****
         * *****
         * *****
         * */
        for (int m = 0; m <= 5; m++) {
            System.out.println("*****");
        }
    }
}

