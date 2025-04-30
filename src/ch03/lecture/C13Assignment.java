package ch03.lecture;

public class C13Assignment {
    public static void main(String[] args) {
        // 대입연산자(활강연산자)
        int a;
        a = 3;
        System.out.println("a = " + a);
        System.out.println("(a = 5) = " + (a = 5));

        int b;
        b = a = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // +=, -=, *=, /=, %=
        // 두 피연산자의 산술연산 후 왼쪽 변수에 결과 대입

        int c = 5;
        c += 7; // c = 7 ;or 5
        System.out.println("c = " + c);
        c -= 9; // c = c - 9;
        c *= 2; // C = c * 8;
        c /= 2; // c = c / 2;
        c %= 5; // c = c % 5;
    }
}
