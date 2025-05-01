package ch04.Lecture;

public class C12While {
    public static void main(String[] args) {
        // while
        // () 조건이 true면 코드블럭 실행
        // 후 다시 조건 확인을 이어감

        System.out.println("code1");
        int i = 0;
        while (1 < 5) {
            System.out.println("code2");
            System.out.println("code3");

            i++;
        }
//        System.out.println("code4");
//        System.out.println("code5");
    }
}
