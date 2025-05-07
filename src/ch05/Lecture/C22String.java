package ch05.Lecture;

public class C22String {
    public static void main(String[] args) {
        // 9번쨰 기본타입이라 부르나 실제로는 참조타입
        String a = "java";  // new 생략 가능
        String f = "java";  // new 생략 가능
        System.out.println(a == f); // true

        String g = "ja";
        String h = "va";
        String i = g+h;

        System.out.println(a == i); //  false


        String b = new String("java");
        String c = new String("react");

        System.out.println(b == c); // false

        String d = new String("java");
        String e = new String("java");

        System.out.println(d == e); // false

        // 결론 : 문자열의 내용이 같은 지 확인 할 때
        // == 쓰지 말것!!!  ->  equals() 메소드 활용
        System.out.println(d == e);
    }
}
