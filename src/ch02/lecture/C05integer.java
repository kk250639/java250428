package ch02.lecture;

public class C05integer {
    public static void main(String[] args) {
        // 정수형
        // byte(1 byte)
        byte a;                         //  a 바이트 타입
        a = 127;                        //  최대값
        System.out.println("a = " + a);
        a = -128;                       //  최소값
        System.out.println("a = " + a);
        // a = 128;
        // a = -129;

        // short(2 bytes)
        short b;                        //  b 숏타입
        b = 32767;                      //  최대값
        System.out.println("b = " + b);
        b = -32768;                     //  최소값
        System.out.println("b = " + b);

        // int(4 bytes)
        int c;                          //  c int타입
        c = 2147483647;
        System.out.println("c = " + c);
        c = -2147483648;
        System.out.println("c = " + c);

        // long(8 bytes)
        long d;                         //  d 롱타입
        d = 9223372036854775807L;
        d = -9223372036854775808L;
        // java 코드에서 정수 literal 는 int로 해석
        // long type iteral 은 끝에 L(l) 붙여야 함
    }
}
