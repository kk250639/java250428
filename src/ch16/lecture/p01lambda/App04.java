package ch16.lecture.p01lambda;

public class App04 {
    public static void main(String[] args) {
        MyInterface04 a = (x, b) -> {   // x와 b를 쓰고있기 떄문에 생략x
            System.out.println(b + ", " + x);
        };
        MyInterface04 c = new MyInterface04() {
            @Override
            public void action(int x, String y) {
                System.out.println(y + ", " + x);
            }
        };
        MyInterface04 d = (x,y) -> System.out.println((y+", "+x));
    }
}

@FunctionalInterface
interface MyInterface04 {
    void action(int a, String b);

}
