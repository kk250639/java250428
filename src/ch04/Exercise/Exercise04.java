package ch04.Exercise;

public class Exercise04 {
    public static void main(String[] args) {
        boolean gotcha = false;
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println(x + "," + y);
                    gotcha = true;
                }
            }
            if (gotcha) {
                break;
            }
        }
    }
}
