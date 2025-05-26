package ch16.lecture.p01;
import java.io.*;
import java.util.*;

public class App10 {
    public static void main(String[] args) {
        MyInterface10 a = () -> new Object();
        MyInterface10 b = Object::new;

        MyInterface11 c = x -> new StringBuffer(x);
        MyInterface11 d = StringBuffer::new;

        MyInterface12 e = (x,y) -> new Scanner(x,y);
        MyInterface12 f = Scanner::new;
    }
}
@FunctionalInterface
interface MyInterface12 {
    void action(InputStream a, String b);
}
@FunctionalInterface
interface MyInterface11 {
    void action(String a);
}
@FunctionalInterface
interface MyInterface10 {
    void action();
}