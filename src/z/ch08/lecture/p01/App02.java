package z.ch08.lecture.p01;

import ch08.lecture.p01interface.MyInterface01;

public class App02 {
    public static void main(String[] args) {
        Child021 a = new Child021();
        Parent02 b = a;

        MyClass02 c = new MyClass02();
        MyInterface02 d = c;
        MyInterface01 e = c;


    }
}
interface MyInterface02 {

}
class Parent02 { }
class Child021 extends Parent02 { }
class MyClass02 implements MyInterface02, MyInterface01 { }
class child022 extends Parent02 implements MyInterface01, MyInterface02 { }