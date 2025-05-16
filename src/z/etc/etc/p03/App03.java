package z.etc.etc.p03;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.action2();
        double b = a.action3();
        System.out.println("b = " + b);
        String s = a.action4();
        System.out.println("s = " + s);
        System.out.println("a.action5() = " + a.action5());
        System.out.println("다음 코드들...");
    }
}
class MyClass03{
    void action2(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        if(true){
            return;
        }
        System.out.println(4);
    }
    double action3(){
        System.out.println(99);
        System.out.println(88);
        return 3.14;
    }
    String action4(){
        return "hello";
    }
    int action5(){
        return 5;
    }
}