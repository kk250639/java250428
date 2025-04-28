package ch02.lecture;

public class C02Variable {
    public static void main(String[] args) {
        // 변수(variable) : 값이 변함
        int a = 3;
        System.out.println(a);

        a = 5;
        System.out.println(a);

        int b = 5;
        int c = 7;

        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // 코드 작성, b가 가지고 있는 값을 c에 b가 가지고있는 값을 c에
        int temp = b;
        b = c;
        c = temp;

        System.out.println("b = " + b); // 7
        System.out.println("c = " + c); // 5
    }
}
