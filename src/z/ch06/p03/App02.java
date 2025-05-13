package z.ch06.p03;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.go();
        MyClass02 b = new MyClass02();
        b.go();
        b.action(3.14);
        b.work(9);
        int c = 10;
        b.work(c);

        b.greeting("hello","java");
    }
}
class MyClass02 {
    void go(){
    }
    void action(double x){
        System.out.println("x = " + x);
    }
    void work(int x){
        System.out.println("x = " + x);
    }
    void greeting(String a, String b){

    }
}