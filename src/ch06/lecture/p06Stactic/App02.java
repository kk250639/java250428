package ch06.lecture.p06Stactic;

public class App02 {
    public static void main(String[] args) {
        System.out.println(MyClass02.number);
    }
}

class MyClass02 {
    // static field
    static int number = 100;

    // static block
    static {
        // static field 초기화 코드 작성 가능
        int a = 3;
        if (true){
            a *= 10;
        }
        number = a;
//        System.out.println("a.age = " + a.age);
    }

    // instance field
    int age;

    MyClass02() {
        int a = 3;
        if (true) {
            a = a * 10;
        }
        this.age = 10;
    }
}
