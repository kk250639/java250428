package ch14.lecture;

public class App06 {
    public static void main(String[] args) throws InterruptedException {
        // Thread 사용 시 주의 해야 하는 점
        //  : 여러 스레드는 공유하는 객체의 상태를 변경할 떄 조심해야함
        //  기대하는 결과가 안나올 수 있기 때문

        Box06 box = new Box06();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();


        int value = box.getValue();
        System.out.println("value = " + value);
    }
}

class Box06 {
    private int value;

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
    }
}
