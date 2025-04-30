package ch04.Exercise;

public class Exercise02 {
    public static void main(String[] args) {

        int sum1 = 0;

        int i = 1;

        while (i <= 100) {
            if (i % 3 == 0) {
                sum1 += i;
            }
            i++;
        }
        System.out.println("1~100중 3의 배수의 합: " + sum1);

        int sum3 = 0;

        for (int z = 1; z <= 100; z++) {
            if (z % 3 == 0) {
                sum3 += z;
            }
        }
        System.out.println("1~100중 3의 배수의 합: " + sum3);
    }
}
