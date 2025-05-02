package ch05.sec09;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] old = {1, 2, 3};
        int[] newarr = new int[5];

        for (int i = 0; i < newarr.length; i++) {
            System.out.println("newarr[" + i + "]=" + newarr[i]);
        }
        // 복사
        for (int i = 0; i < old.length; i++) {
            newarr[i] = old[i];
        }

        System.out.println("복사후-------");
        for (int i = 0; i < newarr.length; i++) {
            System.out.println("newarr[" + i + "]=" + newarr[i]);
        }

        old[0] = 100;
        System.out.println("newarr[0]=" + newarr[0]);
    }
}
