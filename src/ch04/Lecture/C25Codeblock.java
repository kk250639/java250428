package ch04.Lecture;

public class C25Codeblock {
    public static void main(String[] args) {
        if (true) {
            // 코드블록 {} 내의 코드들은 오른쪽 들여쓰기 해야함
            // 꼭!

        } else if (true)
            // 코드블럭 내의 코드가 한 줄이면
            // {} 생략 가능
            // 하지만 생략하지 말것
            System.out.println();
        else
            System.out.println();
        System.out.println();    // 코드를 읽기 어렵게 만듬(초보자 한정)
        for (int i = 0; i < 3; i++) {

        }
        while (true) {
            break;
        }
        for (int i = 0; i < 3; i++)
            System.out.println("hi");
        boolean a = true;
        while (a) {
            System.out.println("hello");
            break;
        }
    }
}
