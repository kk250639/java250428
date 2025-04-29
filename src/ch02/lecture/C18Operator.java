package ch02.lecture;

public class C18Operator {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        int c = a + b;
        System.out.println("c = " + c);

        // 다른 타입끼리 산술연산(+, -, *, /)
        int d = 10;
        long e = 20;
//            int q = d + e;
        long g = d + e;

        int h = 3;
        double i = 3.14;
        double j = h + i; // 산술연산 결과는 큰타입

        // byte, short, int 끼리의 연산결과는 int
        byte k = 5;
        int l = 7;
        int m = k + l;

        byte n = 7;
        byte o = 9;
//        byte p = n + o;
        int q = n + o;

        int r = 5;
        int s = 3;
        int t = r / s;
        System.out.println("t = " + t);

        double u = r / s;
        System.out.println("u = " + u);

        double v = r / (double) s;
        double w = (double) r / s;
        System.out.println("v = " + v);
        System.out.println("w = " + w);
    }
}
