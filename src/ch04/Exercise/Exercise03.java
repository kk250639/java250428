package ch04.Exercise;

public class Exercise03 {
    public static void main(String[] args) {
//        int num1 = (int) ((Math.random() * 6) + 1);
//        int num2 = (int) ((Math.random() * 6) + 1);
        int num1, num2;

        do {
            num1 = (int) ((Math.random() * 6) + 1);
            num2 = (int) ((Math.random() * 6) + 1);

            System.out.println("(눈1:" + num1 + " 눈2:" + num2 + ")");


        } while ((num1 + num2) != 5);
    }
}
