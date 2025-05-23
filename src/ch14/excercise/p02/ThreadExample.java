package ch14.excercise.p02;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        Thread thread2 = new Thread(new MusicRunnable());
        thread1.start();
        thread2.start();

//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 3; i++) {
//
//            }
//        });
//        thread2.start();
    }
}
//
//ThreadExample->MovieThread
//             ->MusicRunnable