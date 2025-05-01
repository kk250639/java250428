package ch05.Lecture;

public class C03Array {
    public static void main(String[] args) {
//        int[] a;          // ctrl+shift+j 합치기 가능
//        a = new int[3];
        int[] a = new int[3];
//        a[0] = 9;
//        a[1] = 8;

        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
        double[] b = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }

        boolean[] c = new boolean[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }

        String[] d = new String[3];
        d[0] = "hi";
        d[1] = "hello";
        d[2] = "안녕";


    }
}
