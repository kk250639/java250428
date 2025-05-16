package ch16.lecture.p01lambda;

public class App06 {
    public static void main(String[] args) {
        Myinterface06 a = () -> {
            System.out.println("code1");
            System.out.println("code2");
        };

        Myinterface06 b = () -> System.out.println("한줄코드");
    }
}

@FunctionalInterface
interface Myinterface06 {
    void action();
}