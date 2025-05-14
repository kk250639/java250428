package ch08.lecture.p06etc;

public class App05 {
    public static void main(String[] args) {
//        MyInterface05.common; // 원하지 않는 일
    }
}
interface MyInterface05 {
    static void action1() {
        System.out.println("MyInterface05.action");
        common();
    }
    static  void action2() {
        System.out.println("MyInerface05.action");
        common();
    }
    private static void common() {
        System.out.println("매우 기~~~인 코드");
    }
}
