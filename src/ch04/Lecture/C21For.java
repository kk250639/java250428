package ch04.Lecture;

public class C21For {
    public static void main(String[] args) {
        for (int q = 0; q <= 5; q++) {
            for (int w = 0; w < 5; w++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------");
        for (int q = 0; q <= 5; q++) {
            for (int w = 5; w > 0; w--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------");
        for (int q = 0; q <= 5; q++) {
            for (int w = 0; w < (5 - q); w++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int q = 0; q <= 5; q++) {
            for (int w = 0; w < 5; w++) {
                System.out.print("*");
            }
            for (int e = 0; e < 5; e++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("------");
        for (int q = 0; q <= 5; q++) {
            for (int w = 0; w < q; w++) {
                System.out.print("*");
            }
            for (int e = 0; e < q; e++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("------");
        for (int q = 0; q <= 5; q++) {
            for (int w = 0; w < q; w++) {
                System.out.print("*");
            }
            for (int e = 5; e > q; e--) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("------");
        for (int q = 0; q <= 5; q++) {
            for (int w = 5; w > q; w--) {
                System.out.print("*");
            }
            for (int e = 0; e < q; e++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("------");
        for (int q = 0; q <= 5; q++) {
            for (int w = 5; w > q; w--) {
                System.out.print("*");
            }
            for (int e = 5; e > q; e--) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("------");
        for (int q = 0; q <= 5; q++) {
            for (int w = 0; w < q; w++) {
                System.out.print("#");
            }
            for (int e = 5; e > q; e--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------");
        for (int q = 0; q <= 5; q++) {
            for (int w = 5; w > q; w--) {
                System.out.print("#");
            }
            for (int e = 0; e < q; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        System.out.println("------");
//        for (int q = 5; q >= 0; q--) {
//            for (int w = 5; w > 0; w--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("------");
//        for (int q = 5; q >= 0; q--) {
//            for (int w = 5; w > (q - 1); w--) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

    }
}

