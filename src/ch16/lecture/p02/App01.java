package ch16.lecture.p02;

public class App01 {
    public static void main(String[] args) {
        MyInterface08 a = () -> System.out.println();
        MyInterface08 b = new MyInterface08() {
            @Override
            public void some() {
                System.out.println();
            }
        };
        // 람다가 특정 인스턴스 메소드 호출 코드만 있따면
        // 그리고 파라미터 목록()이 같으면
        // 메소드 참조:: 로 코드를 줄일 수 있음
        MyClass08 o = new MyClass08();
        MyInterface08 c = () -> o.action();
        MyInterface08 d = o::action;
        MyInterface08 e = o::action;
    }
}


class MyClass08 {
    void action() {
        System.out.println("MyClass08.action");
    }
}

interface MyInterface08 {
    void some();
}