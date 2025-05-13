package z.ch06.p03;

public class App04 {
    public static void main(String[] args) {
        MyClass04 a = new MyClass04();
        a.action();
        a.sum(3, 5);
        a.sum(10, 20, 30);
    }
}
class MyClass04 {
    void action() {
        System.out.println("어떤 코드");
    }

    void sum(int a, int b) {
        System.out.println("받은 값을 더함");
        System.out.println(a+b);
    }
    void sum(int a, int b, int c) {
        System.out.println("여러 값을 더함");
        System.out.println(a + b + c);
    }
}