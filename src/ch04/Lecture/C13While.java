package ch04.Lecture;

public class C13While {
    public static void main(String[] args) {

        // 변수 scope  선언딘 {}내에서만 사용 가능

        boolean b = true;
        int a = 0;
        while (b) {
            a = 3;
            System.out.println(a);
            b = false;
        }

        System.out.println(a);
    }
}
