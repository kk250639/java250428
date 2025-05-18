package ch12.lecture.p01Object;

public class App04 {
    public static void main(String[] args) {
        String a = new String("java");
        String b = new String("java");

        System.out.println(a == b);

        System.out.println(a.equals(b));
    }
}
