package ch05.Lecture;

public class C05Array {
    public static void main(String[] args) {
        // 배열의 초기값을 넣을 수 있다.
        int[] a = new int[]{5, 6, 7};

        // 선언과 동시에 초기값을 넣을 떄 new int[] 생략 가능
        int[] b = new int[]{55, 66, 77};
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
    }
}
