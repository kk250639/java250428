package z.etc.etc.p04;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.print();
    }
}
class MyClass02{
    String name = "머스크";
    int age = 99;
    void print(){
        int a = 3;
        String address = "seoul";
        String name = "도날드";


        System.out.println("이름 = " + name);
        System.out.println("this.이름 = " + this.name);
        System.out.println("this.나이 = " + this.age);
        System.out.println("나이 = " + age);
    }
}
