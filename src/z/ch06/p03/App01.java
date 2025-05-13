package z.ch06.p03;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        a.age = 30;
        a.work();
        a.go();
        a.action();
    }
}
class MyClass01 {
    int age;

    void work() {
        System.out.println("일합니다.");
    }
    void go() {
        System.out.println("가는 중입니다.");
    }
    void action() {
        System.out.println("실행할까요?");
    }
}

