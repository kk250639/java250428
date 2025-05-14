package ch16.lecture.p01lambda;

public class App07 {
    public static void main(String[] args) {
        MyInterface07 a = new MyInterface07() {
            @Override
            public int method() {
                // 코드에 꼭 리턴타입에 맞는 return문을 만나도록 작성
                if (true) {
                    return 3;
                }
                return 5;
            }
        };
        MyInterface07 b = () -> {
            // 코드에 꼭 리턴타입에 맞는 return문을 만나도록 작성
            if (true) {
                return 3;
            }
            return 5;
        };
        MyInterface07 c = () -> {
            // body에 리턴문 하나만 있을 때 {} 생략가능, rturn 생략해함

            return 5;
        };
        MyInterface07 d = () -> 5;
        // body에 리턴문 하나만 있을 때 {} 생략가능, rturn 생략해함

    }
}

@FunctionalInterface
interface MyInterface07 {
    int method();
}
