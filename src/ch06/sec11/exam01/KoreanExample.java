package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "감자바");
        System.out.println("k1.nation = " + k1.nation);
        System.out.println("k1.ssn = " + k1.ssn);
        System.out.println("k1.name = " + k1.name);

        k1.name = "김자바";
        System.out.println("k1.name = " + k1.name);

        Korean k2 = new Korean("343434-5656565", "hong");
        System.out.println("k2.ssn = " + k2.ssn);
    }
}
