package ch04.practice;

public class C01Random {
    public static void main(String[] args) {

        // 두 개의 주사위를 돌려서
        // 같은 값이 나오면 "당첨" 출력
        // 아니면 "다시 돌려보세요" 출력
        int num1 = (int) (Math.random() * 6) + 1;
        int num2 = (int) (Math.random() * 6) + 1;

        if (num1 == num2) {
            System.out.println("당첨");
        } else {
            System.out.println("다시 돌려보세요");
        }
        int a = (int) (Math.random() * 1000) + 1;
    }
}
