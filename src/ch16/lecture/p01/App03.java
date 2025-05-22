package ch16.lecture.p01;

public class App03 {
    public static void main(String[] args) {
        MyInterface03 a = () -> {
            System.out.println("code1");
            System.out.println("code2");
        };
        a.method();

        // method body 여러 줄이면 {} 꼭 써야함
        MyInterface03 b = () -> {
            System.out.println("code11");
            System.out.println("code12");
        };
        b.method();

        MyInterface03 c = () -> System.out.println("code99");
        c.method();
    }
}

@FunctionalInterface
interface MyInterface03 {
    // 파라미터 없는 메소드
    void method();
}