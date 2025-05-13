package ch07.lecture.p05abstract;

public class App05 {
    public static void main(String[] args) {
        String a = "java";
        Object b = a;

        int c = b.hashCode();
        // String.hashCode()가 실행됨
        System.out.println(c);
    }
}
