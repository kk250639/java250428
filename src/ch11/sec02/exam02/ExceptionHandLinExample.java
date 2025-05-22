package ch11.sec02.exam02;

public class ExceptionHandLinExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.langString 클래스가 존재합니다.");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("나머지 코드");
        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.langString2 클래스가 존재합니다.");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("또 나머지 코드");
    }
}
