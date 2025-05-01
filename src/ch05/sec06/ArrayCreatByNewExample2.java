package ch05.sec06;

public class ArrayCreatByNewExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{83, 90, 87};

        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("sum1 = " + sum1);   // 총합

        printitem(new int[]{83, 90, 87});
    }

    public static void printitem(int[] scores) {
        for (int i = 0; i < 3; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }
    }
}
