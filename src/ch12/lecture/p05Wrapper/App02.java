package ch12.lecture.p05Wrapper;

public class App02 {
    public static void main(String[] args) {
        // Wrapper 클래스의 참조변수는
        // 1.null을 저장할 수 있고
        // 2.equals로 비교해야함

        int a = 3;
        int b = 0;

        Integer c = 3;
        Integer d = 0;

        Integer e = null;

        int f = 30000;
        int g = 30000;
        System.out.println(f == g);

        Integer h = 30000;
        Integer i = 30000;
        System.out.println(h == i);
        System.out.println(h.equals(i));
        System.out.println(System.identityHashCode(h));
        System.out.println(System.identityHashCode(i));

        Integer j = 3;
        Integer k = 3;
        System.out.println(j == k);
        System.out.println(j.equals(k));
    }
}
