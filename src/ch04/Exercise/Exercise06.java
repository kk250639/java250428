package ch04.Exercise;

public class Exercise06 {
    public static void main(String[] args) {
        for (int z = 0; z < 5; z++) {
            for (int x = 0; x < (z + 1); x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------- 중첩 for -------");
    }
}