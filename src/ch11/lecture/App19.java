package ch11.lecture;

public class App19 {
    public static void main(String[] args) {
        try {
            method1();
        }catch (HungryException e) {
            e.printStackTrace();
        }
    }
    public static void method1(){
        throw new HungryException("점심시간이라 배고파");
    }
}
// 직접 필요한 exception 만들어 사용 할 수 있음
class HungryException extends RuntimeException {
    HungryException() {
        super("배고파");
    }
    HungryException(String message) {
        super("배고파");
    }

}
