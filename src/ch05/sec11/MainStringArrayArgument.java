package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("프로그램 입력값이 부족");
            System.exit(0);
        }

        String s1 = args[0];
        String s2 = args[1];

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        int r = n1 + n2;
        System.out.println("r = " + r);
    }
}
