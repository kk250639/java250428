package z.etc.etc;

import ch07.lecture.p08protected.sub1.MyClass01;
import z.etc.etc.p01.MyClass02;

public class App01 {
    public static void main(String[] args) {
        String b = new String("java");

        MyClass01 a = new MyClass01();
        MyClass01 c = new MyClass01();

        System.out.println(a == c);
        MyClass02 d = new MyClass02();
    }
}
