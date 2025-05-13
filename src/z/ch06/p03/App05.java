package z.ch06.p03;

public class App05 {
    public static void main(String[] args) {
        MyClass05 a = new MyClass05();
        a.method();
        a.method(1);
        a.method(10,20);
        a.method(10,22,33);

        a.greeting("hello");
        a.greeting("hello",99);
        a.greeting("hello",88,77);

    }
}
class MyClass05{
    void method(int... a){
        System.out.println(a.length + "개의 파라미터 넘어옴");
        for(int i = 0; i < a.length; i++){
            System.out.println("a[i] = " + a[i]);
        }
    }
    void greeting(String a, int... b) {
        for(int i = 0; i <b.length; i++){
            System.out.println("a = " + a);
            System.out.println("b[i] = " + b[i]);
        }
    }
}