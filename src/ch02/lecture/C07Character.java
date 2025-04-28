package ch02.lecture;

public class C07Character {
    public static void main(String[] args) {
        // char : 문자형(character)
        // 하나의 문자를 저장하는 자료형
        // 2bytes, 16bits
        // unicode 사용

        char a;
        a = 'a';
        System.out.println("a = " + a);
        a = 'b';
        System.out.println("a = " + a);
        a = 'c';
        System.out.println("a = " + a);
        a = 'X';
        System.out.println("a = " + a);
        a = 'Y';
        System.out.println("a = " + a);
        a = 'Z';
        System.out.println("a = " + a);
        a = '가';
        System.out.println("a = " + a);
        a = '한';
        System.out.println("a = " + a);
        a = '\ud55c';
        System.out.println("a = " + a);
        a = '\ud55c';
        System.out.println("a = " + a);

        // a = '한글'; //x
        // a = ''; // x
        a = ' ';// ok


    }
}
