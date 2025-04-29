package ch02.lecture;

public class C15Casting {
    public static void main(String[] args) {
        // 작은 타입 -> 큰 타입 (문제없음)

        // 큰 타입 -> 작은 타입 (문제가 있을 수 있음, 매우 조심)

        byte a;
        short b;
        b = 100;
        System.out.println("b = " + b);

        // 기본적으론 안되나 강제로 하면 가능 (type casting)
        a = (byte) b;
        System.out.println("a = " + a);

        b = 128;
        a = (byte) b;
        System.out.println("b = " + b);
        System.out.println("a = " + a); // 128

        b = 987;
        a = (byte) b;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        // 실수형 -> 정수형 (강제로)
        // 소수점 이하 버릴 떄 유용하게 사용
        double c = 123.456;
        // 강제로
        int d = (int) c; // type casting

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
