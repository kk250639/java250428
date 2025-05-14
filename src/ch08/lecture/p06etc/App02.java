package ch08.lecture.p06etc;

public class App02 {
}
interface MyInterface02 {
    void action();

    // default method : 인터페이스에 있는 body가 있는 인스턴스 메소드(추상메소드)
    default void method() {
        System.out.println("MyInterface02.method");
    }

    public default void hello() {
        System.out.println("MyInterface02.hello");
    }
}

class MyClass021 implements MyInterface02 {
    @Override
    public void method() {
        System.out.println("MyClass021.method");
    }

    @Override
    public void action() {
        System.out.println("MyClass021.action");
    }
}

class MyClass022 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println();
    }

    @Override
    public void method() {

    }
}