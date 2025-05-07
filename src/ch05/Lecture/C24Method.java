package ch05.Lecture;

public class C24Method {
    public static void main(String[] args) {
        // java의 String은 변하지 않는다.(불변, immutable)

        // 대문자로 바꾸기
        String a = "Hello World";
        String b = a.toUpperCase();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // 소문자로 바꾸기
        String c = a.toLowerCase();
        System.out.println("a = " + a);
        System.out.println("c = " + c);
    }
}
