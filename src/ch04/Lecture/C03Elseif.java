package ch04.Lecture;

public class C03Elseif {
    public static void main(String[] args) {
        // else if : 이전 조건이 false 일 때 조건을 확인해서 true면 실행되는 블럭

        if (false) {
            System.out.println("코드1");
        } else if (false) {
            System.out.println("코드2");
        } else if (false) {
            System.out.println("코드3");
        } else if (false) {
            System.out.println("코드4");
        } else {
            // 위의 조건이 모두 false일 때
            System.out.println("코드5");
        }
    }
}
