package ch04.Lecture;

public class C19For {
    public static void main(String[] args) {
        // 2 x 1
        // 2 x 2
        // 2 x 3
        // ...
        // 2 x 9

        // 3 x 1
        // ...
        // 3 x 9

        //..

        // 9 x 9

        for (int z = 1; z <= 9; z++) {
            System.out.println("***" + z + "단*** ");
            for (int x = 1; x <= 9; x++) {
                System.out.println(z + " x " + x + " = " + (z * x));
            }
        }
    }
}
