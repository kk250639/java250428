package ch16.lecture.p01;

public class App09 {
    public static void main(String[] args) {
        MyInterface09 o = (a,b,c) -> a.action(b,c);
        MyInterface09 s = (myClass09, a, b) -> myClass09.action(a, b);
    }
}

class MyClass09 {
    void action(int a, int b) {
        System.out.println("MyClass09.action");
    }
}

@FunctionalInterface
interface MyInterface09 {
    void some(MyClass09 a, int b, int c);
}