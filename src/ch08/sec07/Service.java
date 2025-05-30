package ch08.sec07;

public interface Service {

    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("defaultMethod 중복 코드A");
        System.out.println("defaultMethod 중복 코드B");
    }

    static void staticMethod1() {
        System.out.println("staticMEthod1 종속 코드");
        staticCommon();
    }
    static void staticMethod2() {
        System.out.println("staticMEthod2 종속 코드");
        staticCommon();
    }

    public static void staticCommon() {
        System.out.println("staticMethod 중복 코드C");
        System.out.println("staticMethod 중복 코드D");
    }
}
