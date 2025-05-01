package ch05.Lecture;

public class C07Reference {
    public static void main(String[] args) {
        int a;
        a = 3;

        int[] b;
        b = new int[]{4, 5, 6}; // b는 4,5,6을 가지고있는게아님 어딘가에서 참조해올뿐
        // 4,5,6은 어딘가에 저장되고 그것을 참조할 수 있는 값을 가지고있는게 현b

        int c;
        c = a;

        c = 5;

        int[] d;
        d = b;

        d[0] = 44;

        System.out.println("a = " + a);
        System.out.println("b[0] = " + b[0]);
        System.out.println("c = " + c);
        System.out.println("d[0] = " + d[0]);
        // c는 가지고 있는 값을 바꾼 것
        // d[0]은 그 어딘가에 있는 값을 바꿨기때문에 b[0]도 똑같은 값이 나오는 것

    }
}
