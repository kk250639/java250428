package ch07.lecture.p01inheritance;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.age = 33;
        a.name = "trump";
        System.out.println("a.age = " + a.age);
        System.out.println("a.name = " + a.name);
        a.action();
        a.greetiong();

        SubClass012 b = new SubClass012();
        b.age = 44;
        // b.name = "abc";
        b.address = "ny";
        System.out.println("b.age = " + b.age);
        System.out.println("b.address = " + b.address);
        b.action();
//        b.greeting();
        b.go();

        MyClass01 c = new MyClass01();
        c.age = 77;
//        c.name = "q";
//        c.address = "n";
        System.out.println("a.age = " + a.age);
        c.action();
        // c.greeint();

    }
}

//class MyClass02 {

//}

class MyClass01 {
    public int age;

    public void action() {
    }
}

class SubClass011 extends MyClass01 {
    // 자식 클래스(child class)
    // 하위 클래스(sub class)
    // 부모 클래스(parent class)
    // 상위 클래스(super calss)
    //하나의 자식 클래스가 여러 부모x
    //하나의 부모 클래스가 여러 자식x

    // 멤버 추가
    // field
    public String name;
    // method
    public void greetiong() {

    }


}

class SubClass012 extends MyClass01 {

    // 자식 클래스에 추가할 멤버
    // field
    public String address;

    public void go() {
    }
    //method
}